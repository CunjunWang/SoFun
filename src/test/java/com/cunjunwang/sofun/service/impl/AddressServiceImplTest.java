package com.cunjunwang.sofun.service.impl;

import com.cunjunwang.sofun.SoFunApplicationTest;
import com.cunjunwang.sofun.entity.dto.CityDTO;
import com.cunjunwang.sofun.entity.po.SupportCity;
import com.cunjunwang.sofun.service.ServiceMultiResult;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by CunjunWang on 2018/11/6.
 */
public class AddressServiceImplTest extends SoFunApplicationTest {

    @Autowired
    private CityServiceImpl addressService;

    @Test
    public void testSelectAllCities(){
        ServiceMultiResult<CityDTO> cityList = addressService.findAllCities();
        Assert.assertEquals(5, cityList.getResultSize());
    }

}