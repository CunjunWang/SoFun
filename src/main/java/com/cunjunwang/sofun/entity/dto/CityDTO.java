package com.cunjunwang.sofun.entity.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by CunjunWang on 2018/11/6.
 */
@Data
public class CityDTO {

    private Long id;

    private String cityBelongTo;

    private String cityEnName;

    private String cityCnName;

    private String cityLevel;

    private BigDecimal cityMapLongitude;

    private BigDecimal cityMapLatitude;

}
