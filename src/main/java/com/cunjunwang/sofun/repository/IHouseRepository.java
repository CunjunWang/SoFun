package com.cunjunwang.sofun.repository;

import com.cunjunwang.sofun.entity.po.House;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by CunjunWang on 2018/11/6.
 */
@Repository
public interface IHouseRepository extends CrudRepository<House, Long> {

    List<House> findAllByHouseTitleLike(String title);

    List<House> findAllByHousePriceGreaterThan(BigDecimal price);

}
