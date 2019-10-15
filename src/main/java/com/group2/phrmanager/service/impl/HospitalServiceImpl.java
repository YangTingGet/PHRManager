package com.group2.phrmanager.service.impl;

import com.group2.phrmanager.dao.HospitalDao;
import com.group2.phrmanager.entity.HospitalEntity;
import com.group2.phrmanager.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    HospitalDao hospitalDao;

    @Override
    public List<HospitalEntity> getAllHospitals() {
        return hospitalDao.findAll();
    }

    @Override
    public boolean checkHospitalPwd(String hospitalName, String password) {

        HospitalEntity hospitalEntity = hospitalDao.find(hospitalName);

        if (password.equals(hospitalEntity.getHospital_password()))
            return true;
        else
            return false;
    }

    @Override
    public boolean reviseHospitalInfo(HospitalEntity hospitalEntity) {
        boolean result;
        result = hospitalDao.update(hospitalEntity);
        return result;
    }
}
