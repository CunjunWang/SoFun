package com.cunjunwang.sofun.repository;

import com.cunjunwang.sofun.entity.po.HousePicture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by CunjunWang on 2018/11/7.
 */
@Repository
public interface IHousePictureRepository extends CrudRepository<HousePicture, Long> {
}
