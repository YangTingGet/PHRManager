package com.group2.dao;

import com.group2.phrmanager.entity.AdminEntity;
import java.util.List;

/**
 * @author TINGTINGTING
 * 管理员功能持久层接口
 */
public interface AdminDao {
    void add(AdminEntity admin);

    void delete();

    AdminEntity find();

    List<AdminEntity> findAll();

    void update(AdminEntity admin);
}
