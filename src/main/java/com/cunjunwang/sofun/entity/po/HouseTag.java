package com.cunjunwang.sofun.entity.po;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by CunjunWang on 2018/11/7.
 */
@Data
@Entity
@Table(name = "h_house_tag")
public class HouseTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "house_id")
    private Long houseId;

    @Column(name = "house_tag_name")
    private String houseTagName;

    @Column(name = "is_del")
    private Long isDel;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
