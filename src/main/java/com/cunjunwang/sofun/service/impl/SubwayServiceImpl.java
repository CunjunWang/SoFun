package com.cunjunwang.sofun.service.impl;

import com.cunjunwang.sofun.entity.dto.SubwayDTO;
import com.cunjunwang.sofun.entity.dto.SubwayStationDTO;
import com.cunjunwang.sofun.entity.po.Subway;
import com.cunjunwang.sofun.entity.po.SubwayStation;
import com.cunjunwang.sofun.repository.ISubwayRepository;
import com.cunjunwang.sofun.repository.ISubwayStationRepository;
import com.cunjunwang.sofun.service.ISubwayService;
import com.cunjunwang.sofun.service.ServiceMultiResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2018/11/7.
 */
@Service
public class SubwayServiceImpl implements ISubwayService {

    @Autowired
    private ISubwayRepository subwayRepository;

    @Autowired
    private ISubwayStationRepository subwayStationRepository;

    @Override
    public ServiceMultiResult<SubwayDTO> findAllSubwayByCityEnName(String cityEnName) {
        ServiceMultiResult serviceMultiResult = new ServiceMultiResult();
        List<Subway> subwayList = subwayRepository.findAllByCityEnName(cityEnName);
        List<SubwayDTO> subwayDTOList = new ArrayList<>();
        for (Subway subway : subwayList) {
            SubwayDTO subwayDTO = new SubwayDTO();
            BeanUtils.copyProperties(subway, subwayDTO);
            subwayDTOList.add(subwayDTO);
        }
        serviceMultiResult.setResult(subwayDTOList);
        serviceMultiResult.setTotal(subwayDTOList.size());
        return serviceMultiResult;
    }

    @Override
    public ServiceMultiResult<SubwayStationDTO> findAllStationBySubwayId(Long subwayId) {
        ServiceMultiResult serviceMultiResult = new ServiceMultiResult();
        List<SubwayStation> subwayStationList = subwayStationRepository.findAllBySubwayId(subwayId);
        List<SubwayStationDTO> subwayStationDTOList = new ArrayList<>();
        for (SubwayStation subwayStation : subwayStationList) {
            SubwayStationDTO subwayStationDTO = new SubwayStationDTO();
            BeanUtils.copyProperties(subwayStation, subwayStationDTO);
            subwayStationDTOList.add(subwayStationDTO);
        }
        serviceMultiResult.setResult(subwayStationDTOList);
        serviceMultiResult.setTotal(subwayStationDTOList.size());
        return serviceMultiResult;
    }
}
