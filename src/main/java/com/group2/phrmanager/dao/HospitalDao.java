package com.group2.dao;

import com.group2.entiy.HospitalEntiy;

import java.util.List;

/**
 * @author wts
 * 医院功能持久层接口
 * 就诊结果
 */

public interface HospitalDao {
    void add(HospitalEntiy hospital);

    void delete();

    HospitalEntiy find();

    List<HospitalEntiy> findAll();

    void update(HospitalEntiy hospital);

}
