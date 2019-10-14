package com.group2.phrmanager.dao;



import com.group2.phrmanager.entity.HospitalEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wts
 * 医院功能持久层接口
 * 就诊结果
 */
@Repository
@Mapper
public interface HospitalDao {
    boolean add(HospitalEntity hospital);

    boolean delete(String hospitalName);

    HospitalEntity find(String hospitalName);

    List<HospitalEntity> findAll();

    boolean update(HospitalEntity newInfo);
}
