package com.cunjunwang.sofun.repository;

import com.cunjunwang.sofun.entity.po.HouseTag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by CunjunWang on 2018/11/7.
 */
@Repository
public interface IHouseTagRepository extends CrudRepository<HouseTag, Long> {
}
