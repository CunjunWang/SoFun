package com.cunjunwang.sofun.repository;

import com.cunjunwang.sofun.entity.po.SubwayStation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by CunjunWang on 2018/11/7.
 */
@Repository
public interface ISubwayStationRepository extends CrudRepository<SubwayStation, Long> {
    List<SubwayStation> findAllBySubwayId(Long subwayId);
}
