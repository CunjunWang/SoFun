package com.cunjunwang.sofun.entity.po;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by CunjunWang on 2018/11/6.
 */
@Data
@Entity
@Table(name = "s_support_city")
public class SupportCity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_belong_to")
    private String cityBelongTo;

    @Column(name = "city_en_name")
    private String cityEnName;

    @Column(name = "city_cn_name")
    private String cityCnName;

    @Column(name = "city_level")
    private String cityLevel;

    @Column(name = "city_map_longitude")
    private BigDecimal cityMapLongitude;

    @Column(name = "city_map_latitude")
    private BigDecimal cityMapLatitude;

    public enum CityLevel {
        CITY("city"),
        REGION("region");

        private String value;

        CityLevel(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static CityLevel of(String value) {
            for (CityLevel level : CityLevel.values()) {
                if(level.getValue().equals(value)) {
                    return level;
                }
            }

            throw new IllegalArgumentException("No such value");
        }
    }

}
