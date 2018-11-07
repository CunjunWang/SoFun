package com.cunjunwang.sofun.service;

import com.cunjunwang.sofun.entity.po.House;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by CunjunWang on 2018/11/6.
 */
public interface IHouseService {

    List<House> findAllByHouseTitleLike(String title);

    List<House> findAllByHousePriceGreaterThan(BigDecimal price);
}
