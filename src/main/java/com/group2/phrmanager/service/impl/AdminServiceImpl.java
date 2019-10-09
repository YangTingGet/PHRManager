package com.group2.phrmanager.service.impl;

import com.group2.phrmanager.entity.AdviceEntity;
import com.group2.phrmanager.entity.UserEntity;
import com.group2.phrmanager.service.AdminService;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    @Override
    public boolean checkAdminPwd(String userName, String password) {
        return false;
    }

    @Override
    public List<AdviceEntity> getAdviceState0() {
        return null;
    }

    @Override
    public boolean reviseAdviceState() {
        return false;
    }

    @Override
    public boolean addHospital() {
        return false;
    }

    @Override
    public boolean deleteHospital() {
        return false;
    }

    @Override
    public boolean getHospitalInformation() {
        return false;
    }

    @Override
    public UserEntity getUserInfo() {
        return null;
    }
}
