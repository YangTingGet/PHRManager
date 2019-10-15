package com.group2.phrmanager.service;

import com.group2.phrmanager.entity.DoctorEntity;

import java.util.List;

/**
* @author wts
* */
public interface DoctorService {
    /* 获取所有的医生*/
    List<DoctorEntity> getAllDoctors();
}
