package com.group2.phrmanager.service;

import com.group2.phrmanager.entity.ABSEntity;
import com.group2.phrmanager.entity.MedRecordEntity;
import com.group2.phrmanager.entity.MedicineEntity;
import com.group2.phrmanager.entity.UserEntity;

import java.util.List;

public interface UserService {
    /**
     * 登录验证用户密码
     */
    boolean checkUserPwd(String userName,String password);

    /**
     * 注册验证用户名
     */
    boolean checkUserName(String userName);

    /**
     * 实现用户注册
     */
    boolean saveUserInfo(UserEntity userEntity);

    /**
     * 修改用户信息
     */
    boolean reviseUserInfo(UserEntity userEntity);


    /**
     * 查询一些药品用于展示药品
     */

    List<MedicineEntity> QueryDrugs();


    /**
     * 根据药品名称查询药品信息
     */
    List<MedicineEntity> QueryDrugsbydrugName(String medName);

    //病历夹
    /**
     *查询病历夹信息
     */
    ABSEntity QueryABSbyuserName(String userName);

    /**
     *修改备忘录笔记
     */
    boolean reviseNotes(String notes,String userName);

    /**
     * 根据用户名查看该用户的病历
     */
    MedRecordEntity QueryMedRecordbyuserName(String userName);

    /**
     * 保存用户对服务的评价
     */
    boolean saveRemarks(String remarks,String userName);






















}
