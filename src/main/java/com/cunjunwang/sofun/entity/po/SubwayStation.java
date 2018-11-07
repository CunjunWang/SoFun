package com.cunjunwang.sofun.entity.po;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by CunjunWang on 2018/11/7.
 */
@Data
@Entity
@Table(name = "s_subway_station")
public class SubwayStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subway_id")
    private Long subwayId;

    @Column(name = "subway_station_name")
    private String subwayStationName;

    @Column(name = "is_del")
    private Long isDel;
}
