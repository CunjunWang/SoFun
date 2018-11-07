package com.cunjunwang.sofun.repository;

import com.cunjunwang.sofun.entity.po.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by CunjunWang on 2018/11/2.
 */
@Repository
public interface IUserRepository extends CrudRepository<User, Long> {

    User findByUserName(String userName);

}
