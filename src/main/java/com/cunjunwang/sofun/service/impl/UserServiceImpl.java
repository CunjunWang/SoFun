package com.cunjunwang.sofun.service.impl;

import com.cunjunwang.sofun.entity.User;
import com.cunjunwang.sofun.entity.UserRole;
import com.cunjunwang.sofun.repository.IUserRepository;
import com.cunjunwang.sofun.repository.IUserRoleRepository;
import com.cunjunwang.sofun.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2018/11/6.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IUserRoleRepository userRoleRepository;

    @Override
    public User findUserByName(String userName) {
        User user = userRepository.findByUserName(userName);
        if (user == null) {
            return null;
        }
        List<UserRole> roleList = userRoleRepository.findUserRolesByUserId(user.getId());
        if (roleList == null || roleList.isEmpty()) {
            throw new DisabledException("Error - 用户角色列表为空");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        roleList.forEach(userRole -> authorities.add(new SimpleGrantedAuthority(userRole.getRoleName())));
        user.setAuthorityList(authorities);

        return user;
    }

}
