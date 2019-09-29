package com.group2.phrmanager.dao;

import com.group2.phrmanager.entity.HospitalEntity;

import java.util.List;

/**
 * @author wts
 * 医院功能持久层接口
 * 就诊结果
 */

public interface HospitalDao {
    void add(HospitalEntity hospital);

    void delete();

    HospitalEntity find();

    List<HospitalEntity> findAll();

    void update(HospitalEntity hospital);

}
