package com.cunjunwang.sofun.service.impl;

import com.cunjunwang.sofun.SoFunApplicationTest;
import com.cunjunwang.sofun.entity.po.House;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by CunjunWang on 2018/11/6.
 */
public class HouseServiceImplTest extends SoFunApplicationTest {

    private static final Logger logger = LoggerFactory.getLogger(HouseServiceImplTest.class);

    @Autowired
    private HouseServiceImpl houseService;

    @Test
    public void testFindAllByTitle() {
        String title = "%测试%";
        List<House> houses = houseService.findAllByHouseTitleLike(title);
        houses.forEach(house -> logger.info("House data: {}", house.toString()));
        Assert.assertEquals(2, houses.size());
    }

    @Test
    public void testFindAllByHousePriceGreaterThan() {
        BigDecimal price = new BigDecimal(3300);
        List<House> houses = houseService.findAllByHousePriceGreaterThan(price);
        houses.forEach(house -> logger.info("House data: {}", house.toString()));
        Assert.assertEquals(8, houses.size());
    }

}