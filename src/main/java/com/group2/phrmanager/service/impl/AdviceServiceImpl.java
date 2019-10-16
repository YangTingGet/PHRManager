package com.group2.phrmanager.service.impl;

import com.group2.phrmanager.dao.AdviceDao;
import com.group2.phrmanager.entity.AdviceEntity;
import com.group2.phrmanager.service.AdviceService;
import com.group2.phrmanager.unti.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdviceServiceImpl implements AdviceService {
    @Autowired
    AdviceDao adviceDao;

    @Override
    public List<AdviceEntity> getAllAdvice() {
        return adviceDao.findAll();
    }

    @Override
    public int getAdviceCount() {
        return adviceDao.selectAdviceCount();
    }

    @Override
    public List<AdviceEntity> getAllAdviceByPage(Page page) {
        return adviceDao.selectAdviceByPage(page);
    }

    @Override
    public AdviceEntity getAdviceDetails(String h_id) {
        return adviceDao.selectAdviceById(h_id);
    }
}
