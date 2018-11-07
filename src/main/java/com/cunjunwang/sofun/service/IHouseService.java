package com.cunjunwang.sofun.service;

import com.cunjunwang.sofun.entity.dto.HouseDTO;
import com.cunjunwang.sofun.entity.po.House;
import com.cunjunwang.sofun.entity.vo.AddHouseVO;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by CunjunWang on 2018/11/6.
 */
public interface IHouseService {

    ServiceResult<HouseDTO> save(AddHouseVO addHouseVO);

    List<House> findAllByHouseTitleLike(String title);

    List<House> findAllByHousePriceGreaterThan(BigDecimal price);
}
