package com.cunjunwang.sofun.repository;

import com.cunjunwang.sofun.entity.po.SupportCity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**˙
 * Created by CunjunWang on 2018/11/6.
 */
public interface ISupportCityRepository extends CrudRepository<SupportCity, Long> {
    List<SupportCity> findAllByCityLevel(String level);

    List<SupportCity> findAllRegionsByCityEnName(String cityEnName);
}
