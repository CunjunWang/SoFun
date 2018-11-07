package com.cunjunwang.sofun.security;

import com.cunjunwang.sofun.entity.po.User;
import com.cunjunwang.sofun.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * Created by CunjunWang on 2018/11/6.
 */
public class AuthProvider implements AuthenticationProvider {

    @Autowired
    private IUserService userService;

    private final Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userName = authentication.getName();
        String inputPassword = (String) authentication.getCredentials();

        User user = userService.findUserByName(userName);
        if (user == null) {
            throw new AuthenticationCredentialsNotFoundException("Error - Credential Not Found 未找到认证信息");
        }

//        if (this.passwordEncoder.isPasswordValid(user.getUserPassword(), inputPassword, user.getId())) {
//            return new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
//        }

        if (user.getUserPassword().equals(inputPassword)) {
            return new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
        }

        throw new BadCredentialsException("Error - 验证错误");
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
