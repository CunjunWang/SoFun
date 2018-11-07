package com.cunjunwang.sofun.entity.po;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by CunjunWang on 2018/11/7.
 */
@Data
@Entity
@Table(name = "h_house_picture")
public class HousePicture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "house_id")
    private Long houseId;

    @Column(name = "cdn_prefix")
    private String cdnPrefix;

    @Column(name = "picture_width")
    private Long pictureWidth;

    @Column(name = "picture_height")
    private Long pictureHeight;

    @Column(name = "location")
    private String location;

    @Column(name = "path")
    private String path;

    @Column(name = "is_del")
    private Long isDel;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
