package com.group2.phrmanager.service.impl;

import com.group2.phrmanager.dao.AdminDao;
import com.group2.phrmanager.entity.AdminEntity;
import com.group2.phrmanager.entity.AdviceEntity;
import com.group2.phrmanager.entity.HospitalEntity;
import com.group2.phrmanager.entity.UserEntity;
import com.group2.phrmanager.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDao adminDao;

    @Override
    public boolean checkAdminPwd(String userName, String password) {
        AdminEntity adminEntity=adminDao.find(userName);
        if(password.equals(adminEntity.getAdmin_password()))
            return true;
        else
            return false;
    }

    @Override
    public List<AdviceEntity> getAdviceState0() {


        return null;
    }

    @Override
    public boolean reviseAdviceState(String adviceId) {


        return false;
    }

    @Override
    public boolean addHospital(HospitalEntity hospitalEntity) {
        adminDao.addHospital();

        return adminDao.addHospital();
    }

    @Override
    public boolean deleteHospital(String hospitalName) {
        adminDao.deleteHospitalByName(hospitalName);
        return adminDao.deleteHospitalByName(hospitalName);
    }

    @Override
    public HospitalEntity getHospitalInformation(String hospitalName) {
        adminDao.findHospitalByName(hospitalName);

        return adminDao.findHospitalByName(hospitalName);
    }

    @Override
    public UserEntity getUserInfo(String userName) {
        adminDao.findUserByUsername(userName);

        return adminDao.findUserByUsername(userName);
    }
}
