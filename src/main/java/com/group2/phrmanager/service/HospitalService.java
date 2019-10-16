package com.group2.phrmanager.service;

import com.group2.phrmanager.entity.HospitalEntity;

import java.util.List;

public interface HospitalService {

//    @author wts
    /* 查询所有的医院*/
    List<HospitalEntity> getAllHospitals();

    /**
     * 登录验证密码
     */
    boolean checkHospitalPwd(String HospitalName,String password);

    /**
     * 修改医院信息
     * @param hospitalEntity
     * @return
     */
    boolean reviseHospitalInfo(HospitalEntity hospitalEntity);
}
