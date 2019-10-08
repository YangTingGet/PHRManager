package com.group2.phrmanager.service.impl;

import com.group2.phrmanager.dao.DrugDao;
import com.group2.phrmanager.dao.UserDao;
import com.group2.phrmanager.entity.ABSEntity;
import com.group2.phrmanager.entity.MedRecordEntity;
import com.group2.phrmanager.entity.MedicineEntity;
import com.group2.phrmanager.entity.UserEntity;
import com.group2.phrmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    DrugDao drugDao;

    @Override
    public boolean checkUserPwd(String username, String password) {

        UserEntity userEntity = userDao.find(username);
        if (password.equals(userEntity.Password))
            return true;
        return false;
    }

    @Override
    public boolean checkUserName(String userName) {

        UserEntity userEntity = userDao.find(userName);

        return userEntity == null?false:true;
    }

    @Override
    public boolean saveUserInfo(UserEntity userEntity) {

        boolean result;
        result = userDao.add(userEntity);

        return result;
    }

    @Override
    public boolean reviseUserInfo(UserEntity userEntity) {

        boolean result;
        result = userDao.update(userEntity);
        return result;
    }

    @Override
    public List<MedicineEntity> QueryDrugs() {

        return drugDao.findSome();
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
