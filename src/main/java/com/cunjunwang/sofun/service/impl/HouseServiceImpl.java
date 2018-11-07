package com.cunjunwang.sofun.service.impl;

import com.cunjunwang.sofun.entity.dto.HouseDTO;
import com.cunjunwang.sofun.entity.po.House;
import com.cunjunwang.sofun.entity.vo.AddHouseVO;
import com.cunjunwang.sofun.repository.IHouseRepository;
import com.cunjunwang.sofun.service.IHouseService;
import com.cunjunwang.sofun.service.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by CunjunWang on 2018/11/6.
 */
@Service
public class HouseServiceImpl implements IHouseService {

    @Autowired
    private IHouseRepository houseRepository;

    @Override
    public ServiceResult<HouseDTO> save(AddHouseVO addHouseVO) {
        return null;
    }

    @Override
    public List<House> findAllByHouseTitleLike(String title) {
        return houseRepository.findAllByHouseTitleLike(title);
    }

    @Override
    public List<House> findAllByHousePriceGreaterThan(BigDecimal price) {
        return houseRepository.findAllByHousePriceGreaterThan(price);
    }
}
