package com.group2.phrmanager.dao;


import com.group2.phrmanager.entity.AdminEntity;
import com.group2.phrmanager.entity.HospitalEntity;
import com.group2.phrmanager.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TINGTINGTING
 * 管理员功能持久层接口
 * 暂定！！！
 */
@Repository
public interface AdminDao {
    boolean add(AdminEntity admin);

    boolean deleteHospitalByName(String Name);

    AdminEntity find(String userName);

    HospitalEntity findHospitalByName(String HospitalName);

    List<AdminEntity> findAll();

    UserEntity findUserByUsername(String userName);

    void update(AdminEntity admin);

    boolean addHospital();
}
