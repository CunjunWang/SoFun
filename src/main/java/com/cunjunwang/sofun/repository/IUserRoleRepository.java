package com.cunjunwang.sofun.repository;

import com.cunjunwang.sofun.entity.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by CunjunWang on 2018/11/6.
 */
@Repository
public interface IUserRoleRepository extends CrudRepository<UserRole, Long> {
    List<UserRole> findUserRolesByUserId(Long userId);
}
