package com.cunjunwang.sofun.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by CunjunWang on 2018/11/2.
 */
@Entity
@Data
@Table(name = "u_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_phone_number")
    private String userPhoneNumber;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "is_del")
    private Long isDel;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "last_login_time")
    private Date lastLoginTime;

    @Column(name = "user_profile")
    private String userProfile;

    @Column(name = "user_role")
    private Long userRole;
}
