package com.cunjunwang.sofun.repository;

import com.cunjunwang.sofun.SoFunApplicationTest;
import com.cunjunwang.sofun.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2018/11/2.
 */
public class IUserRepositoryTest extends SoFunApplicationTest {

    @Autowired
    private IUserRepository iUserRepository;

    @Test
    public void testFindOne() {
        User user = iUserRepository.findOne(1L);
        Assert.assertEquals("cunjunwang", user.getUsername());
    }

}