package com.cunjunwang.sofun.service;

import com.cunjunwang.sofun.entity.dto.CityDTO;

/**
 * Created by CunjunWang on 2018/11/6.
 */
public interface ICityService {
    ServiceMultiResult<CityDTO> findAllCities();

    ServiceMultiResult<CityDTO> findAllRegionsByCityName(String cityEnName);
}
