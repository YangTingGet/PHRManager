package com.group2.phrmanager.service.impl;


import com.group2.phrmanager.dao.AbsDao;

import com.group2.phrmanager.dao.DrugDao;
import com.group2.phrmanager.dao.UserDao;
import com.group2.phrmanager.entity.ABSEntity;
import com.group2.phrmanager.entity.CaseHistory;
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
    @Autowired
    AbsDao absDao;

    @Autowired
    DrugDao drugDao;

    @Override
    public UserEntity getInfo(String userName) {
        return userDao.find(userName);
    }

    @Override
    public boolean checkUserPwd(String username, String password) {

        UserEntity userEntity = userDao.find(username);
        System.out.println(userEntity.getPassword());
        System.out.println(password);
        if (password.equals(userEntity.getPassword()))
            return true;
        else
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

        return drugDao.find(medName);
    }

    @Override
    public ABSEntity QueryABSbyuserName(String userName) {
        return absDao.find(userName);
    }

    @Override
    public boolean reviseNotes(String notes, String userName) {
        return absDao.updateNotes(notes,userName);
    }

    @Override
    public CaseHistory QueryMedRecordbyuserName(String userName) {

        return null;
    }

    @Override
    public boolean saveRemarks(String remarks, String userName) {
        absDao.doRemark(remarks,userName);
        return absDao.doRemark(remarks,userName);
    }
}
