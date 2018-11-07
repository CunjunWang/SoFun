package com.cunjunwang.sofun.entity.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by CunjunWang on 2018/11/7.
 */
@Data
public class HouseDTO {

    private Long id;

    private String houseTitle;

    private BigDecimal housePrice;

    private Long houseArea;

    private Long houseRoomNumber;

    private Long houseFloor;

    private Long houseTotalFloor;

    private Long houseViewTimes;

    private Long houseBuildYear;

    private Long houseStatus;

    private String houseCityEnName;

    private String houseRegionEnName;

    private Long houseDirection;

    private BigDecimal houseDistanceToSubway;

    private Long houseParlour;

    private String houseEstate;

    private Long houseBathroomNumber;

    private String houseStreet;
}
