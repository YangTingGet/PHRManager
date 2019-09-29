package com.group2.phrmanager.service.impl;

import com.group2.phrmanager.entity.ABSEntity;
import com.group2.phrmanager.entity.MedRecordEntity;
import com.group2.phrmanager.entity.MedicineEntity;
import com.group2.phrmanager.entity.UserEntity;
import com.group2.phrmanager.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public boolean checkUserPwd(String username, String password) {

        return false;
    }

    @Override
    public boolean checkUserName(String userName) {
        return false;
    }

    @Override
    public boolean saveUserInfo(UserEntity userEntity) {
        return false;
    }

    @Override
    public boolean reviseUserInfo(UserEntity userEntity) {
        return false;
    }

    @Override
    public List<MedicineEntity> QueryDrugs() {
        return null;
    }

    @Override
    public List<MedicineEntity> QueryDrugsbydrugName(String medName) {
        return null;
    }

    @Override
    public ABSEntity QueryABSbyuserName(String userName) {
        return null;
    }

    @Override
    public boolean reviseNotes(String notes, String userName) {
        return false;
    }

    @Override
    public MedRecordEntity QueryMedRecordbyuserName(String userName) {
        return null;
    }

    @Override
    public boolean saveRemarks(String remarks, String userName) {
        return false;
    }
}
