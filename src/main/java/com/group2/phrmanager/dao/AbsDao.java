package com.group2.phrmanager.dao;


import com.group2.phrmanager.entity.ABSEntity;

import java.util.List;

public interface AbsDao {
    boolean add(ABSEntity abs);

    boolean delete(String absNumber);

    ABSEntity find(String absNumber);

    List<ABSEntity> findAll();

    void update(ABSEntity newInfo);
}
