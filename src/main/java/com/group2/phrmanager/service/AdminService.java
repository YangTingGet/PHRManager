package com.group2.phrmanager.service;


import com.group2.phrmanager.entity.AdviceEntity;
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
    boolean reviseAdviceState();

    /**
     * 添加医院
     */
    boolean addHospital();

    /**
     * 删除医院
     */
    boolean deleteHospital();

    /**
     * 得到医院信息
     */
    boolean getHospitalInformation();

    /**
     * 查看用户信息
     */
    UserEntity getUserInfo();

    /**
     * 查看用户订单
     */



}
