package com.cunjunwang.sofun.config;

import com.cunjunwang.sofun.security.AuthFailureHandler;
import com.cunjunwang.sofun.security.AuthProvider;
import com.cunjunwang.sofun.security.LoginUrlEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by CunjunWang on 2018/11/4.
 */
@EnableWebSecurity
@EnableGlobalMethodSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * Http access control
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/user/login").permitAll()
                .antMatchers("/admin/login").permitAll()
                .antMatchers("/static/**").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/user/**").hasAnyRole("ADMIN", "USER")
                .antMatchers("/api/user/**").hasAnyRole("ADMIN", "USER")
                .and()
                .formLogin()
                .loginProcessingUrl("/login")
                .failureHandler(authFailureHandler())
                .and()
                .logout().logoutUrl("/logout").logoutSuccessUrl("/logout/page")
                .deleteCookies("JSESSIONID").invalidateHttpSession(true).and()
                .exceptionHandling().authenticationEntryPoint(urlEntryPoint())
                .accessDeniedPage("/403");

        // 防御策略关闭
        http.csrf().disable();
        http.headers().frameOptions().sameOrigin();
    }

    // 只能有一个AuthenticationManagerBuilder注入
//    /**
//     * 自定义内存认证策略
//     * @param authenticationManagerBuilder
//     */
//    @Autowired
//    public void configGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//        authenticationManagerBuilder
//                .inMemoryAuthentication()
//                .withUser("admin")
//                .password("admin")
//                .roles("ADMIN")
//                .and();
//    }

    // 只能有一个AuthenticationManagerBuilder注入

    /**
     * 自定义内存认证策略
     *
     * @param authenticationManagerBuilder
     */
    @Autowired
    public void configGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) {
        authenticationManagerBuilder.authenticationProvider(authProvider())
                .eraseCredentials(true);
    }

    @Bean
    public AuthProvider authProvider() {
        return new AuthProvider();
    }

    @Bean
    public LoginUrlEntryPoint urlEntryPoint() {
        return new LoginUrlEntryPoint("/user/login");
    }

    @Bean
    public AuthFailureHandler authFailureHandler() {
        return new AuthFailureHandler(urlEntryPoint());
    }
}
