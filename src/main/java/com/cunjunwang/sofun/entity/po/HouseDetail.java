package com.cunjunwang.sofun.entity.po;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by CunjunWang on 2018/11/7.
 */
@Data
@Entity
@Table(name = "h_house_detail")
public class HouseDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "house_id")
    private Long houseId;

    @Column(name = "house_description")
    private String houseDescription;

    @Column(name = "house_layout_description")
    private String houseLayoutDescription;

    @Column(name = "house_traffic")
    private String houseTraffic;

    @Column(name = "house_round_service")
    private String houseRoundService;

    @Column(name = "house_rent_way")
    private Long houseRentWay;

    @Column(name = "house_address")
    private String houseAddress;

    @Column(name = "house_subway_line_id")
    private Long houseSubwayLineId;

    @Column(name = "house_subway_line_name")
    private String houseSubwayLineName;

    @Column(name = "house_subway_station_id")
    private Long houseSubwayStationId;

    @Column(name = "house_subway_station_name")
    private String houseSubwayStationName;

    @Column(name = "subway_line_name")
    private String subwayLineName;

    @Column(name = "subway_station_name")
    private String subwayStationName;

    @Column(name = "is_del")
    private Long isDel;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

}
