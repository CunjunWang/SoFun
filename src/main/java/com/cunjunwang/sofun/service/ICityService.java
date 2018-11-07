package com.cunjunwang.sofun.service;

import com.cunjunwang.sofun.entity.dto.CityDTO;
import com.cunjunwang.sofun.entity.po.SupportCity;

import java.util.Map;

/**
 * Created by CunjunWang on 2018/11/6.
 */
public interface ICityService {
    ServiceMultiResult<CityDTO> findAllCities();

    ServiceMultiResult<CityDTO> findAllRegionsByCityName(String cityEnName);

    Map<SupportCity.CityLevel, CityDTO> findCityAndRegion(String cityEnName, String regionEnName);
}
