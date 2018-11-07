package com.cunjunwang.sofun.entity.po;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by CunjunWang on 2018/11/6.
 */
@Data
@Entity
@Table(name = "h_house")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "house_title")
    private String houseTitle;

    @Column(name = "house_price")
    private BigDecimal housePrice;

    @Column(name = "house_area")
    private Long houseArea;

    @Column(name = "house_room_number")
    private Long houseRoomNumber;

    @Column(name = "house_floor")
    private Long houseFloor;

    @Column(name = "house_total_floor")
    private Long houseTotalFloor;

    @Column(name = "house_view_times")
    private Long houseViewTimes;

    @Column(name = "house_build_year")
    private Long houseBuildYear;

    @Column(name = "house_status")
    private Long houseStatus;

    @Column(name = "house_city_en_name")
    private String houseCityEnName;

    @Column(name = "house_region_en_name")
    private String houseRegionEnName;

    @Column(name = "house_direction")
    private Long houseDirection;

    @Column(name = "house_distance_to_subway")
    private BigDecimal houseDistanceToSubway;

    @Column(name = "house_parlour")
    private Long houseParlour;

    @Column(name = "house_estate")
    private String houseEstate;

    @Column(name = "house_bathroom_number")
    private Long houseBathroomNumber;

    @Column(name = "house_street")
    private String houseStreet;

}
