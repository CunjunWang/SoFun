package com.cunjunwang.sofun.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by CunjunWang on 2018/11/6.
 */
@Data
@Entity
@Table(name = "u_user_role")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;


}
