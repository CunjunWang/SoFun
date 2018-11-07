package com.cunjunwang.sofun.entity.dto;

import lombok.Data;

/**
 * Created by CunjunWang on 2018/11/7.
 */
@Data
public class SubwayDTO {

    private Long id;

    private Long subwayLineNumber;

    private String subwayLineName;

    private String cityEnName;

    private Long isDel;
}
