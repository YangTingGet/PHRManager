package com.group2.phrmanager.dao;


import com.group2.phrmanager.entity.AdminEntity;

import java.util.List;

/**
 * @author TINGTINGTING
 * 管理员功能持久层接口
 * 暂定！！！
 */
public interface AdminDao {
    boolean add(AdminEntity admin);

    boolean delete();

    AdminEntity find();

    List<AdminEntity> findAll();

    void update(AdminEntity admin);
}
