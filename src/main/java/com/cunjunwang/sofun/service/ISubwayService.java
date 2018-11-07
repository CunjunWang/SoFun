package com.cunjunwang.sofun.service;

import com.cunjunwang.sofun.entity.dto.SubwayDTO;
import com.cunjunwang.sofun.entity.dto.SubwayStationDTO;

/**
 * Created by CunjunWang on 2018/11/7.
 */
public interface ISubwayService {

    ServiceMultiResult<SubwayDTO> findAllSubwayByCityEnName(String cityEnName);

    ServiceMultiResult<SubwayStationDTO> findAllStationBySubwayId(Long subwayId);
}
