-- ----------------------------
--  Records of `u_user`
-- ----------------------------
BEGIN;
INSERT INTO `sofun`.`u_user` (`user_name`,
                              `user_email`,
                              `user_phone_number`,
                              `user_password`,
                              `is_del`,
                              `create_time`,
                              `update_time`,
                              `last_login_time`,
                              `user_profile`,
                              `user_role`)
VALUES ('cunjunwang', '13621691063@163.com', '13621691063', '65261599Duck', DEFAULT, DEFAULT, NULL, NULL, NULL, NULL),
       ('admin', 'admin@163.com', '123456789012', 'admin', DEFAULT, DEFAULT, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
--  Records of `u_user_role`
-- ----------------------------
BEGIN;
INSERT INTO `sofun`.`u_user_role` (`user_id`, `role_name`)
VALUES ('1', 'USER'),
       ('2', 'ADMIN');
COMMIT;

-- ----------------------------
--  Records of `s_support_city`
-- ----------------------------
BEGIN;
INSERT INTO `sofun`.`s_support_city` (`city_belong_to`,
                                      `city_en_name`,
                                      `city_cn_name`,
                                      `city_level`,
                                      `city_map_longitude`,
                                      `city_map_latitude`)
VALUES ('bj', 'bj', '北京', 'city', '116.395645', '39.929986'),
       ('sh', 'sh', '上海', 'city', '121.487899', '31.249162'),
       ('hb', 'sjz', '石家庄', 'city', '114.522082', '38.048958'),
       ('hb', 'ts', '唐山', 'city', '118.183451', '39.650531'),
       ('hb', 'hd', '邯郸', 'city', '114.482694', '36.609308'),
       ('bj', 'dcq', '东城区', 'region', '116.42188470126446', '39.93857401298612'),
       ('bj', 'xcq', '西城区', 'region', '116.37319010401802', '39.93428014370851'),
       ('bj', 'hdq', '海淀区', 'region', '116.23967780102151', '40.03316204507791'),
       ('bj', 'cpq', '昌平区', 'region', '116.21645635689414', '40.2217235498323'),
       ('sh', 'ptq', '普陀区', 'region', '121.39844294374956', '31.263742929075534'),
       ('sjz', 'caq', '长安区', 'region', '114.59262155387033', '38.07687479578663'),
       ('sjz', 'qdq', '桥东区', 'region', '114.51078430496142', '38.06338975380927'),
       ('sjz', 'qxq', '桥西区', 'region', '114.43813995531943', '38.033364550068136'),
       ('sjz', 'xhq', '新华区', 'region', '114.4535014286928', '38.117218640478164'),
       ('bj', 'cyq', '朝阳区', 'region', '116.52169489108084', '39.95895316640668');
COMMIT;

-- ----------------------------
--  Records of `h_house`
-- ----------------------------
BEGIN;
INSERT INTO `sofun`.`h_house` (`house_title`,
                               `house_price`,
                               `house_area`,
                               `house_room_number`,
                               `house_floor`,
                               `house_total_floor`,
                               `house_view_times`,
                               `house_build_year`,
                               `house_status`,
                               `create_time`,
                               `update_time`,
                               `house_city_en_name`,
                               `house_region_en_name`,
                               `house_cover`,
                               `house_direction`,
                               `house_distance_to_subway`,
                               `house_parlour`,
                               `house_estate`,
                               `house_admin_id`,
                               `house_bathroom_number`,
                               `house_street`)
VALUES ('富力城 国贸CBD 时尚休闲 商务办公',
        6200,
        70,
        2,
        10,
        20,
        2,
        2005,
        1,
        DEFAULT,
        NULL,
        'bj',
        'hdq',
        'NULL',
        '2',
        '10',
        '1',
        '融泽嘉园',
        '2',
        '0',
        '龙域西二路'),
       ('富力城 国贸CBD 时尚休闲 商务办公',
        '6300',
        '70',
        '2',
        '10',
        '20',
        '0',
        '2012',
        '1',
        '2017-09-06 19:53:35',
        '2017-12-03 11:13:42',
        'bj',
        'hdq',
        'FvkO1FFyGbrxCP_1O9tA94u2qvbP',
        '1',
        '-1',
        '1',
        '融泽嘉园',
        '2',
        '0',
        '龙域西二路'),
       ('二环东直门地铁站附近、王府井、天安门、国贸、三里屯、南锣鼓巷',
        '3000',
        '35',
        '1',
        '5',
        '10',
        '2',
        '2013',
        '1',
        '2017-09-06 20:45:35',
        '2017-12-03 11:13:36',
        'bj',
        'hdq',
        'FpVYJRsLykrBRyUSCEOeqsqWU-bt',
        '1',
        '200',
        '0',
        '融泽嘉园',
        '2',
        '0',
        '龙域西二路'),
       ('华贸城 东向一居挑空loft 干净温馨 随时可以签约',
        '5700',
        '52',
        '1',
        '7',
        '20',
        '0',
        '2012',
        '1',
        '2017-09-06 21:01:02',
        '2017-12-03 11:13:30',
        'bj',
        'hdq',
        'Fl1lNikhmMIecbTn-JTsurxugtFU',
        '2',
        '1085',
        '1',
        '融泽嘉园',
        '2',
        '0',
        '龙域西二路'),
       ('望春园板楼三居室 自住精装 南北通透 采光好视野棒！',
        '9200',
        '132',
        '3',
        '6',
        '14',
        '0',
        '2005',
        '1',
        '2017-09-06 22:44:25',
        '2017-12-03 11:13:25',
        'bj',
        'hdq',
        'Fp1xPKVYtPsCeVHVQVW0Hif2FXk7',
        '2',
        '1108',
        '2',
        '融泽嘉园',
        '2',
        '0',
        '龙域西二路'),
       ('高大上的整租两居室 业主诚意出租',
        '5400',
        '56',
        '2',
        '12',
        '20',
        '0',
        '2012',
        '1',
        '2017-09-06 23:39:50',
        '2017-12-03 11:13:20',
        'bj',
        'hdq',
        'FvVqU8LneZZ5xaLBAOM1KXR2Pz1X',
        '2',
        '-1',
        '1',
        '融泽嘉园',
        '2',
        '0',
        '龙域西二路'),
       ('新康园 正规三居室 精装修 家电家具齐全',
        '1900',
        '18',
        '1',
        '13',
        '25',
        '0',
        '2012',
        '1',
        '2017-09-07 00:52:47',
        '2017-12-03 11:13:15',
        'bj',
        'hdq',
        'FnuOFbFtDYTbpPdFoZthR-R0tszC',
        '3',
        '1302',
        '0',
        '融泽嘉园',
        '2',
        '0',
        '龙域西二路'),
       ('湖光壹号望京华府183-387㎡阔景大宅',
        '50000',
        '288',
        '5',
        '1',
        '1',
        '0',
        '2015',
        '1',
        '2017-09-07 11:42:20',
        '2017-12-03 11:13:10',
        'bj',
        'hdq',
        'FvVqU8LneZZ5xaLBAOM1KXR2Pz1X',
        '5',
        '200',
        '3',
        '融泽嘉园',
        '2',
        '0',
        '龙域西二路'),
       ('测试房源-编辑',
        '3000',
        '59',
        '2',
        '10',
        '20',
        '0',
        '2010',
        '3',
        '2017-10-28 22:34:48',
        '2017-11-11 12:22:50',
        'bj',
        'cpq',
        'FtbxR2LY98lnnX_TPOgOPzti3k7G',
        '2',
        '1000',
        '1',
        '融泽嘉园',
        '2',
        '0',
        '龙域中街');
COMMIT;

-- ----------------------------
--  Records of `s_subway`
-- ----------------------------
BEGIN;
INSERT INTO `sofun`.`s_subway` (`subway_line_number`, `subway_line_name`, `city_en_name`)
VALUES ('13', '13号线', 'bj'),
       ('1', '1号线', 'bj'),
       ('2', '2号线', 'bj'),
       ('10', '10号线', 'bj'),
       ('8', '8号线', 'bj'),
       ('9', '9号线', 'bj'),
       ('7', '7号线', 'bj');
COMMIT;

-- ----------------------------
--  Records of `s_subway_station`
-- ----------------------------
BEGIN;
INSERT INTO `sofun`.`s_subway_station` (`subway_id`, `subway_station_name`)
VALUES ('1', '上地'),
       ('1', '东直门'),
       ('1', '五道口'),
       ('1', '光熙门'),
       ('1', '北苑'),
       ('1', '回龙观'),
       ('1', '大钟寺'),
       ('1', '望京西'),
       ('1', '柳芳'),
       ('1', '知春路'),
       ('1', '立水桥'),
       ('1', '芍药居'),
       ('1', '西二旗'),
       ('1', '西直门'),
       ('1', '霍营'),
       ('1', '龙泽'),
       ('4', '三元家庄'),
       ('4', '三元桥'),
       ('4', '丰台站'),
       ('4', '亮马桥'),
       ('4', '健德门'),
       ('4', '公主坟'),
       ('4', '六里桥'),
       ('4', '农业展览馆'),
       ('4', '分钟寺'),
       ('4', '劲松'),
       ('4', '北土城'),
       ('4', '十里河'),
       ('4', '双井'),
       ('4', '呼家楼'),
       ('4', '团结湖'),
       ('4', '国贸'),
       ('4', '大红门'),
       ('4', '太阳宫'),
       ('4', '安贞门'),
       ('4', '宋家庄'),
       ('4', '巴沟'),
       ('4', '惠新西街南口'),
       ('4', '慈寿寺'),
       ('4', '成寿寺'),
       ('4', '泥洼'),
       ('4', '海淀黄庄'),
       ('4', '潘家园'),
       ('4', '火器营'),
       ('4', '牡丹园'),
       ('4', '知春路'),
       ('4', '知春里'),
       ('4', '石榴庄'),
       ('4', '纪家庙'),
       ('4', '芍药居'),
       ('4', '苏州街'),
       ('4', '草桥'),
       ('4', '莲花桥'),
       ('4', '西土城'),
       ('4', '西局'),
       ('4', '西钓鱼台'),
       ('4', '角门东'),
       ('4', '角门西'),
       ('4', '车道沟'),
       ('4', '金台夕照'),
       ('4', '长春桥'),
       ('4', '首经贸');
COMMIT;

-- ----------------------------
--  Records of `h_house_detail`
-- ----------------------------
BEGIN;
INSERT INTO `sofun`.`h_house_detail` (`house_description`,
                                      `house_layout_description`,
                                      `house_traffic`,
                                      `house_round_service`,
                                      `house_rent_way`,
                                      `house_address`,
                                      `house_subway_line_id`,
                                      `house_subway_line_name`,
                                      `house_subway_station_id`,
                                      `house_subway_station_name`,
                                      `house_id`)
VALUES ('国贸CBD商务区,近SOHO现代城,富顿中心,富力城商业街区,乐成中心,潘家园古玩城,八王坟长途客运站,北京游乐园,经由三环路可直达首都机场。附近有双井桥南,双井桥北,双井桥东双井桥西等30多条公交站牌!\n《天安门,故宫,王府井,三里屯,前门,天坛,北海,颐和园,雍和宫,奥林匹克公园,水立方,西单,欢乐谷,燕莎商城等》知名购物区及旅游名胜古迹,是您休闲旅游及商务下榻的理想选择',
        '房间采光良好,落地窗外景色宜人',
        '房子处于北京的CBD商务中心区国贸双井!紧邻双井地铁站,步行5分钟即到!这离国贸、中央电视台、潘家园、三里屯、团结湖、日坛使馆区、儿研所、大郊亭都很近',
        '房子闹中取静,地理位置优越,交通方便,紧邻呼家楼地铁站和东大桥地铁站;去机场可乘坐东直门机场快轨,非常方便｡购物中心有双井购物中心、国贸购物中心和侨福芳草地购物中心、三里屯购物中心等,远道而来的朋友可尽览都市璀璨!',
        '0',
        '二号院7号楼',
        '4',
        '10号线',
        '58',
        '双井',
        '3'),
       ('国贸CBD商务区,近SOHO现代城,富顿中心,富力城商业街区,乐成中心,潘家园古玩城,八王坟长途客运站,北京游乐园,经由三环路可直达首都机场。附近有双井桥南,双井桥北,双井桥东双井桥西等30多条公交站牌!\n《天安门,故宫,王府井,三里屯,前门,天坛,北海,颐和园,雍和宫,奥林匹克公园,水立方,西单,欢乐谷,燕莎商城等》知名购物区及旅游名胜古迹,是您休闲旅游及商务下榻的理想选择!',
        '房间采光良好,落地窗外景色宜人',
        '房子处于北京的CBD商务中心区国贸双井!紧邻双井地铁站,步行5分钟即到',
        '这离国贸、中央电视台、潘家园、三里屯、团结湖、日坛使馆区、儿研所、大郊亭都很近。房子闹中取静,地理位置优越,交通方便,紧邻呼家楼地铁站和东大桥地铁站;去机场可乘坐东直门机场快轨,非常方便｡购物中心有双井购物中心、国贸购物中心和侨福芳草地购物中心、三里屯购物中心等,远道而来的朋友可尽览都市璀璨！',
        '0',
        '1号院1号楼',
        '1',
        '13号线',
        '5',
        '上地',
        '4'),
       ('我和我女盆友当房东已经一年了,也是超赞房东,希望能为大家提供舒适的住所~ 房间的大门和房门都是密码门,小区有保安24小时值班,非常安全方便。 通常入住时间是下午三点,提前来的同学可以先寄存行李和洗澡哦~\n\n',
        '房間非常漂亮,空間很大,鵝黃色的牆壁看起來非常舒服',
        '位置距離地鐵站不遠',
        '距故宫、天安门、王府井、三里屯、簋街、南锣鼓巷等景点均可地铁半小时内到达,交通便利~',
        '0',
        '1号院2号楼',
        '1',
        '13号线',
        '16',
        '东直门',
        '17'),
       ('这个经纪人很懒，没写核心卖点',
        '此房是一居室的格局，上下两层，面宽，房间亮堂，进门右手厨房，正前方是25平米的客厅，楼上是卧室，带洗手间！ 喧闹和安静隔开，适合居住',
        '小区距离地铁13号线北苑站500米的距离，交通出行便利....',
        '小区楼下就是华贸天地娱乐街，保利电影院，眉州东坡，中信银行，麦当劳等娱乐休闲设施齐全',
        '0',
        '1号院3号楼',
        '1',
        '13号线',
        '11',
        '北苑',
        '18'),
       ('这个经纪人很懒，没写核心卖点',
        '此房为望春园小区板楼南北通透户型，主卧客厅朝南，次卧朝北，两个客厅双卫，居住很舒适。',
        '距离地铁5号线立水桥南站630米，有464,465,966,081，621等多条公交线路，交通出行四通八达。',
        '小区旁有大型购物商场易事达，物美超市，丰宁蔬菜基地，航空总医院、安贞医院北苑分院，中国银行、中国农业银行、中国工商银行、中国交通银行、中国建设银行、招商银行分布。小区旁有天奥健身房，还有立水桥公园..',
        '0',
        '6号院1号楼',
        '1',
        '13号线',
        '10',
        '立水桥',
        '19'),
       ('高大上的整租两居室 业主诚意出租\n1、客厅挑高、宽敞舒适、阳光充足 2、卧室搭配的很新颖，使用之高 3、厨房带阳台，让您和家人有足够的空间展现私家厨艺',
        '客厅挑高、宽敞舒适、阳光充足 2、卧室搭配的很新颖，使用之高 3、厨房带阳台，让您和家人有足够的空间展现私家厨艺',
        '近地铁13号线东直门站',
        '社区环境好，环境优美，适宜居住，人文素质高，物业管理完善； 2、属于低密度社区 ，适宜居住 3、小区的林密树多，让您感受花园一样的家',
        '0',
        '1号院5号楼',
        '1',
        '13号线',
        '16',
        '东直门',
        '20'),
       ('房子是正规三室一厅一厨一卫，装修保持的不错，家电家具都齐全。\n',
        '房子客厅朝北面积比较大，主卧西南朝向，次卧朝北，另一个次卧朝西，两个次卧面积差不多大。',
        '小区出南门到8号线育新地铁站614米，交通便利，小区500米范围内有物美，三旗百汇，龙旗广场等几个比较大的商场，生活购物便利，出小区北门朝东952米是地铁霍营站，是8号线和 13号线的换乘站，同时还有个S2线，通往怀来。（数据来源百度地图）',
        '小区西边300米就是物美超市和三旗百汇市场（日常百货、粮油米面、瓜果蔬菜、生鲜海货等等，日常生活很便利，消费成本低），北边200米是龙旗购物广场和永辉超市（保利影院，KFC，麦当劳等，轻松满足娱乐消费）。小区里还有商店，饭店，家政等。',
        '0',
        '2号院1号楼',
        '1',
        '13号线',
        '9',
        '霍营',
        '21'),
       ('懒死了 不谢', '户型介绍', '交通出行', '周边配套', '0', '3号院1号楼', '1', '13号线', '12', '望京西', '24'),
       ('房屋描述-编辑', '户型介绍', '交通出行', '周边配套-编辑', '0', '3号院2单元1003', '1', '13号线', '8', '回龙观', '25');
COMMIT;

-- ----------------------------
--  Records of `h_house_tag`
-- ----------------------------
BEGIN;
INSERT INTO `sofun`.`h_house_tag` (`house_id`, `house_tag_name`)
VALUES ('18', '独立阳台'),
       ('17', '空调'),
       ('16', '光照充足'),
       ('15', '随时看房'),
       ('14', '集体供暖'),
       ('13', '精装修'),
       ('12', '独立卫生间'),
       ('11', '独立阳台'),
       ('19', '光照充足'),
       ('20', '独立卫生间'),
       ('10', '光照充足'),
       ('3', '精装修'),
       ('8', '集体供暖'),
       ('21', '独立阳台');
COMMIT;