package com.group2.phrmanager.service;

import com.group2.phrmanager.entity.HospitalEntity;

public interface HospitalService {

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
