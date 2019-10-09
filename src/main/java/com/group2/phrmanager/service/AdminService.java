package com.group2.phrmanager.service;


import com.group2.phrmanager.entity.AdviceEntity;
import com.group2.phrmanager.entity.HospitalEntity;
import com.group2.phrmanager.entity.UserEntity;

import java.util.List;

public interface AdminService {
    /**
     * 登录验证管理员密码
     */
    boolean checkAdminPwd(String userName,String password);

    /**
     * 查询未审核的资讯
     */
    List<AdviceEntity> getAdviceState0();

    /**
     * 更改审核状态
     */
    boolean reviseAdviceState(String adviceId);

    /**
     * 添加医院
     */
    boolean addHospital(HospitalEntity hospitalEntity);

    /**
     * 删除医院
     */
    boolean deleteHospital(String hospitalName);

    /**
     * 得到医院信息
     */
    HospitalEntity getHospitalInformation(String hospitalName);

    /**
     * 查看用户信息
     */
    UserEntity getUserInfo(String userName);

    /**
     * 查看用户订单
     */



}
