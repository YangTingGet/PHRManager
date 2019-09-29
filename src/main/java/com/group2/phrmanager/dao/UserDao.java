package com.group2.phrmanager.dao;


import com.group2.phrmanager.entity.ABSEntity;
import com.group2.phrmanager.entity.MedRecordEntity;
import com.group2.phrmanager.entity.MedicineEntity;
import com.group2.phrmanager.entity.UserEntity;
import java.util.List;

/**
 * @author TINGTINGTING
 * 用户功能持久层接口
 */
public interface UserDao {

    void add(UserEntity user);

    void delete();

    UserEntity find();

    List<UserEntity> findAll();

    void update(UserEntity user);

    /**
     * 查询用户密码
     */
    String selectPassword(String userName);

    /**
     * 修改用户密码
     */
    boolean updatePassword(String userName,String password);

    /**
     * 根据用户名查询用户信息
     */
    UserEntity selectUserbyuserName(String userName);

    /**
     * 更新用户信息
     */
    boolean updeteUser(UserEntity userEntiy);


//查看药品信息
    /**
     * 查询数据库前几样药品
     */
    List<MedicineEntity> selectDrugs();

    /**
     * 根据药品名称查询药品信息
     */
    MedicineEntity selectDrugbyDrugName(String drugName);


//病历夹
    /**
     *查询病历夹信息
     */
    ABSEntity selectABSbyuserName(String userName);

    /**
     *修改备忘录笔记
     */
    boolean updateNotes(String notes,String userName);

    /**
     * 根据用户名查看该用户的病历
     */
    MedRecordEntity selectMedRecordbyuserName(String userName);

    /**
     * 更新用户对服务评价
     */
    boolean updateRemarks(String remarks,String userName);


//用户挂号


//访问资讯

}


















