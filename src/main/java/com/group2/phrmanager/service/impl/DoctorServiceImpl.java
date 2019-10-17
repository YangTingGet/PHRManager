package com.group2.phrmanager.service.impl;

import com.group2.phrmanager.dao.DoctorDao;
import com.group2.phrmanager.entity.DoctorEntity;
import com.group2.phrmanager.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wts
 */

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorDao doctorDao;
    @Override
    public List<DoctorEntity> getAllDoctors() {
        return doctorDao.findAll();
    }
}
