package com.cunjunwang.sofun.service;

import com.cunjunwang.sofun.entity.po.User;

/**
 * Created by CunjunWang on 2018/11/6.
 */
public interface IUserService {

    User findUserByName(String userName);

}
