SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;
DROP Database if exists sofun;
CREATE Database sofun;
USE sofun;

# 用户信息表
CREATE TABLE u_user
(
    id bigint(20) PRIMARY KEY COMMENT '用户Id，唯一标识' AUTO_INCREMENT,
    user_name varchar(200) COMMENT '用户姓名',
    user_email varchar(200) COMMENT '邮箱',
    user_phone_number varchar(200) COMMENT '手机号',
    user_password varchar(200) NOT NULL COMMENT '密码',
    is_del bigint(20) DEFAULT 0 COMMENT '逻辑删除符，0 - 未删除，1 - 已删除',
    create_time datetime DEFAULT current_timestamp COMMENT '创建时间',
    update_time datetime COMMENT '更新时间',
    last_login_time datetime COMMENT '上次登录时间',
    user_profile varchar(200) COMMENT '用户头像',
    user_role bigint(20) COMMENT '用户角色'
);
ALTER TABLE u_user COMMENT = '用户信息';

# 用户角色表
CREATE TABLE if not exists u_user_role
(
    id bigint(20) PRIMARY KEY COMMENT '条目Id, 唯一标识' AUTO_INCREMENT,
    user_id bigint(20) COMMENT '用户Id',
    role_name varchar(200) COMMENT '角色名',
    is_del bigint(20) DEFAULT 0 COMMENT '逻辑删除符，0 - 未删除，1 - 已删除',
    create_time datetime DEFAULT current_timestamp COMMENT '创建时间',
    update_time datetime COMMENT '更新时间'
);
ALTER TABLE u_user_role COMMENT = '用户角色';

# 房屋基础信息表
CREATE TABLE if not exists h_house
(
    id bigint(20) PRIMARY KEY COMMENT '房屋Id，唯一标识' AUTO_INCREMENT,
    house_title varchar(200) COMMENT '房屋标题',
    house_price decimal(14,2) DEFAULT 0 COMMENT '房屋价格',
    house_area bigint(20) COMMENT '房屋面积',
    house_room_number bigint(20) COMMENT '卧室数量',
    house_floor bigint(20) COMMENT '房屋楼层',
    house_total_floor bigint(20) COMMENT '总楼层',
    house_view_times bigint(20) COMMENT '浏览量',
    house_build_year bigint(20) COMMENT '建造时间',
    house_status bigint(20) DEFAULT 0 COMMENT '状态标识符，0 - 未审核，1 - 审核通过，2 - 已出租，3 - 逻辑删除',
    create_time datetime DEFAULT current_timestamp COMMENT '创建时间',
    update_time datetime COMMENT '更新时间',
    house_city_en_name varchar(200) COMMENT '房屋所在城市英语缩写',
    house_region_en_name varchar(200) COMMENT '房屋缩在区域缩写',
    house_cover varchar(200) COMMENT '房屋封面图',
    house_direction bigint(20) COMMENT '房屋朝向',
    house_distance_to_subway decimal(14,1) DEFAULT -1 COMMENT '房屋到地铁的距离，-1默认附近没有地铁',
    house_parlour bigint(20) COMMENT '房屋客厅数量',
    house_estate varchar(200) COMMENT '房屋所在小区',
    house_admin_id bigint(20) COMMENT '房屋管理员用户Id',
    house_bathroom_number bigint(20) DEFAULT 0 COMMENT '房屋洗手间数量',
    house_street varchar(200) COMMENT '房屋所在街区'
);
ALTER TABLE h_house COMMENT = '房屋基础信息';

# 房屋图片信息表
CREATE TABLE if not exists h_house_picture
(
    id bigint(20) PRIMARY KEY COMMENT '条目Id' AUTO_INCREMENT,
    house_id bigint(20) COMMENT '房屋Id',
    cdn_prefix varchar(200) COMMENT 'CDN前缀',
    picture_width bigint(20) COMMENT '图片宽度',
    picture_height bigint(20) COMMENT '图片高度',
    location varchar(200) COMMENT '所属房屋位置',
    path varchar(200) COMMENT '图片路径',
    is_del bigint(20) DEFAULT 0 COMMENT '逻辑删除符，0 - 未删除，1 - 已删除',
    create_time datetime DEFAULT current_timestamp COMMENT '创建时间',
    update_time datetime COMMENT '更新时间'
);
ALTER TABLE h_house_picture COMMENT = '房屋图片信息';

# 房屋详细信息表
CREATE TABLE if not exists h_house_detail
(
    id bigint(20) PRIMARY KEY COMMENT '条目Id' AUTO_INCREMENT,
    house_description varchar(500) COMMENT '房屋描述',
    house_layout_description varchar(200) COMMENT '房屋布局描述',
    house_traffic varchar(200) COMMENT '房屋周边交通情况',
    house_round_service varchar(200) COMMENT '周边服务',
    house_rent_way bigint(20) COMMENT '租赁方式',
    house_address varchar(200) COMMENT '房屋地址',
    house_subway_line_id bigint(20) COMMENT '房屋地铁线路Id',
    house_subway_line_name varchar(200) COMMENT '房屋地铁线路名',
    house_subway_station_id bigint(20) COMMENT '房屋周边地铁站Id',
    house_subway_station_name varchar(200) COMMENT '房屋周边地铁站名',
    house_id bigint(20) COMMENT '房屋Id',
    is_del bigint(20) DEFAULT 0 COMMENT '逻辑删除符，0 - 未删除，1 - 已删除',
    create_time datetime DEFAULT current_timestamp COMMENT '创建时间',
    update_time datetime COMMENT '更新时间'
);
ALTER TABLE h_house_detail COMMENT = '房屋详细信息';

# 房屋标签表
CREATE TABLE if not exists h_house_tag
(
    id bigint(20) PRIMARY KEY COMMENT '条目Id' AUTO_INCREMENT,
    house_id bigint(20) COMMENT '房屋Id',
    house_tag_name varchar(200) COMMENT '房屋标签名',
    is_del bigint(20) DEFAULT 0 COMMENT '逻辑删除符，0 - 未删除，1 - 已删除',
    create_time datetime DEFAULT current_timestamp COMMENT '创建时间',
    update_time datetime COMMENT '更新时间'
);
ALTER TABLE h_house_tag COMMENT = '房屋标签';

# 房屋预约表
CREATE TABLE if not exists h_house_reservation
(
    id bigint(20) PRIMARY KEY COMMENT '流水号' AUTO_INCREMENT,
    house_id bigint(20) COMMENT '房屋Id',
    user_id bigint(20) COMMENT '用户Id',
    reservation_description varchar(200) COMMENT '预约描述',
    is_del bigint(20) DEFAULT 0 COMMENT '逻辑删除符，0 - 未删除，1 - 已删除',
    reservaation_status bigint(20) DEFAULT 0 COMMENT '预约状态，1 - 加入待看清单，2 - 已预约看房时间，3 - 看房完成',
    create_time datetime DEFAULT current_timestamp COMMENT '创建时间',
    update_time datetime COMMENT '更新时间',
    reservation_order_time datetime COMMENT '下单时间',
    reservation_telephone varchar(200) COMMENT '联系电话',
    house_admin_id bigint(20) COMMENT '房屋所有人Id'
);
ALTER TABLE h_house_reservation COMMENT = '房屋预约';

# 城市信息表
CREATE TABLE if not exists s_support_city
(
    id bigint(20) PRIMARY KEY COMMENT '条目Id' AUTO_INCREMENT,
    city_belong_to varchar(200),
    city_en_name varchar(200) COMMENT '城市英文名',
    city_cn_name varchar(200) COMMENT '城市中文名',
    city_level varchar(200) COMMENT '城市等级',
    city_map_longitude decimal(14,2) COMMENT '城市地图经度',
    city_map_latitude decimal(14,2) COMMENT '城市地图纬度',
    is_del bigint(20) DEFAULT 0 COMMENT '逻辑删除符，0 - 未删除，1 - 已删除',
    create_time datetime DEFAULT current_timestamp COMMENT '创建时间',
    update_time datetime COMMENT '更新时间'
);
ALTER TABLE s_support_city COMMENT = '城市信息';

# 地铁线路信息
CREATE TABLE s_subway
(
    id bigint PRIMARY KEY COMMENT '条目Id' AUTO_INCREMENT,
    subway_line_number bigint(20) COMMENT '地铁线路编号',
    subway_line_name varchar(200) COMMENT '地铁线路名',
    city_en_name varchar(200) COMMENT '地铁所在城市英文名',
    is_del bigint(20) DEFAULT 0 COMMENT '逻辑删除符，0 - 未删除，1 - 已删除'
);
ALTER TABLE s_subway COMMENT = '地铁线路信息';

# 地铁站信息
CREATE TABLE if not exists s_subway_station
(
    id bigint(20) PRIMARY KEY COMMENT '条目Id
' AUTO_INCREMENT,
    subway_id bigint(20) COMMENT '地铁线路Id',
    subway_station_name varchar(200) COMMENT '地铁站名',
    is_del bigint(20) DEFAULT 0 COMMENT '逻辑删除符，0 - 未删除，1 - 已删除'
);
ALTER TABLE s_subway_station COMMENT = '地铁站信息';