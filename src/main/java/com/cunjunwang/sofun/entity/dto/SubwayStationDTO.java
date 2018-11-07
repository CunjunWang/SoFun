package com.cunjunwang.sofun.entity.dto;

import lombok.Data;

/**
 * Created by CunjunWang on 2018/11/7.
 */
@Data
public class SubwayStationDTO {

    private Long id;

    private Long subwayId;

    private String subwayStationName;

    private Long isDel;
}
