package com.group2.phrmanager.dao;


import com.group2.phrmanager.entity.TradeEntity;

import java.util.List;

/* 暂定！！！*/

public interface TreatRecordDao {
    boolean add(TradeEntity treatRecordEntity);

    boolean delete();

    TradeEntity find();

    List<TradeEntity> findAll();

    boolean update(TradeEntity treatRecordEntity);
}
