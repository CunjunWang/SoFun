package com.cunjunwang.sofun.service.impl;

import com.cunjunwang.sofun.SoFunApplicationTest;
import com.cunjunwang.sofun.entity.dto.SubwayDTO;
import com.cunjunwang.sofun.entity.dto.SubwayStationDTO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by CunjunWang on 2018/11/7.
 */
public class SubwayServiceImplTest extends SoFunApplicationTest {

    @Autowired
    private SubwayServiceImpl subwayService;

    @Test
    public void testFindAllByCityName() {
        String cityName = "bj";
        List<SubwayDTO> subwayDTOList = subwayService.findAllSubwayByCityEnName(cityName).getResult();
        Assert.assertEquals(7, subwayDTOList.size());

        cityName = "sh";
        subwayDTOList = subwayService.findAllSubwayByCityEnName(cityName).getResult();
        Assert.assertEquals(0, subwayDTOList.size());
    }

    @Test
    public void testFindAllStationBySubwayId() {
        Long subwayId = 1L;
        List<SubwayStationDTO> subwayStationDTOList = subwayService.findAllStationBySubwayId(subwayId).getResult();
        Assert.assertEquals(16, subwayStationDTOList.size());

        subwayId = 2L;
        subwayStationDTOList = subwayService.findAllStationBySubwayId(subwayId).getResult();
        Assert.assertEquals(0, subwayStationDTOList.size());
    }

}