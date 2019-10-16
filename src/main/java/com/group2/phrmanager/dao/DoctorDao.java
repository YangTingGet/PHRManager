package com.group2.phrmanager.dao;



import com.group2.phrmanager.entity.DoctorEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DoctorDao {
    boolean add(DoctorEntity doctorEntity);

    boolean delete(String doctorNumber);

    DoctorEntity find(String doctorNumber);

    List<DoctorEntity> findAll();

    boolean update(DoctorEntity newInfo);
}
