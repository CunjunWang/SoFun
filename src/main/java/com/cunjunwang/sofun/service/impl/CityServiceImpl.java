package com.cunjunwang.sofun.service.impl;

import com.cunjunwang.sofun.entity.dto.CityDTO;
import com.cunjunwang.sofun.entity.po.SupportCity;
import com.cunjunwang.sofun.repository.ISupportCityRepository;
import com.cunjunwang.sofun.service.ICityService;
import com.cunjunwang.sofun.service.ServiceMultiResult;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2018/11/6.
 */
@Service
public class CityServiceImpl implements ICityService {

    @Autowired
    private ISupportCityRepository supportCityRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ServiceMultiResult<CityDTO> findAllCities() {
        ServiceMultiResult serviceMultiResult = new ServiceMultiResult();
        List<SupportCity> cityList = supportCityRepository.findAllByCityLevel("city");
        List<CityDTO> cityDTOList = new ArrayList<>();
        for(SupportCity city : cityList) {
            CityDTO cityDTO = new CityDTO();
            BeanUtils.copyProperties(city, cityDTO);
            cityDTOList.add(cityDTO);
        }
        serviceMultiResult.setTotal(cityDTOList.size());
        serviceMultiResult.setResult(cityDTOList);
        return serviceMultiResult;
    }

    @Override
    public ServiceMultiResult<CityDTO> findAllRegionsByCityName(String cityEnName) {
        ServiceMultiResult serviceMultiResult = new ServiceMultiResult();
        List<SupportCity> regionList = supportCityRepository.findAllRegionsByCityEnName(cityEnName);
        List<CityDTO> result = new ArrayList<>();
        for (SupportCity region : regionList) {
            CityDTO regionDTO = new CityDTO();
            BeanUtils.copyProperties(region, regionDTO);
            result.add(regionDTO);
        }
        serviceMultiResult.setResult(result);
        serviceMultiResult.setTotal(result.size());
        return serviceMultiResult;
    }
}
