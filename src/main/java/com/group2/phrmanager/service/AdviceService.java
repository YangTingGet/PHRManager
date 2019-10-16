package com.group2.phrmanager.service;

import com.group2.phrmanager.entity.AdviceEntity;
import com.group2.phrmanager.unti.Page;

import java.util.List;

public interface AdviceService {
    List<AdviceEntity> getAllAdvice();

    int getAdviceCount();

    List<AdviceEntity>  getAllAdviceByPage(Page page);

    AdviceEntity getAdviceDetails(String h_id);
}
