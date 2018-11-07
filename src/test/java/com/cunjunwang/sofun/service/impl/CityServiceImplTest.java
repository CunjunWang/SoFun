package com.cunjunwang.sofun.service.impl;

import com.cunjunwang.sofun.SoFunApplicationTest;
import com.cunjunwang.sofun.entity.dto.CityDTO;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by CunjunWang on 2018/11/7.
 */
public class CityServiceImplTest extends SoFunApplicationTest {

    private static final Logger logger = LoggerFactory.getLogger(CityServiceImplTest.class);

    @Autowired
    private CityServiceImpl cityService;

    @Test
    public void testFindAllCities() {
        List<CityDTO> cityDTOList = cityService.findAllCities().getResult();
        for (CityDTO cityDTO : cityDTOList) {
            logger.info("this data: {}", cityDTO.toString());
        }
        Assert.assertEquals(5, cityDTOList.size());
    }

    @Test
    public void testFindAllRegionsByCityName() {
        String cityName = "sh";
        List<CityDTO> regionDTOList = cityService.findAllRegionsByCityName(cityName).getResult();
        Assert.assertEquals(1, regionDTOList.size());

        cityName = "gd";
        regionDTOList = cityService.findAllRegionsByCityName(cityName).getResult();
        Assert.assertEquals(0, regionDTOList.size());

        cityName = "bj";
        regionDTOList = cityService.findAllRegionsByCityName(cityName).getResult();
        Assert.assertEquals(5, regionDTOList.size());

        cityName = "sjz";
        regionDTOList = cityService.findAllRegionsByCityName(cityName).getResult();
        Assert.assertEquals(4, regionDTOList.size());
    }

}