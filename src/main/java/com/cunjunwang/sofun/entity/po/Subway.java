package com.cunjunwang.sofun.entity.po;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by CunjunWang on 2018/11/7.
 */
@Data
@Entity
@Table(name = "s_subway")
public class Subway {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subway_line_number")
    private Long subwayLineNumber;

    @Column(name = "subway_line_name")
    private String subwayLineName;

    @Column(name = "city_en_name")
    private String cityEnName;

    @Column(name = "is_del")
    private Long isDel;
}
