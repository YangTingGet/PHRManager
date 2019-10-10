package com.group2.phrmanager.entity;

import java.util.Date;

/**
 * 医生实体类
 * @author 王见林
 */
public class DoctorEntity {
    private int doctor_num; //医生编号（主键）
    private String doctor_name; //医生姓名
    private String doctor_category; //科室
    private String hospital_name; //所属医院名（外键）

    public int getDoctor_num() {
        return doctor_num;
    }

    public void setDoctor_num(int doctor_num) {
        this.doctor_num = doctor_num;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getDoctor_category() {
        return doctor_category;
    }

    public void setDoctor_category(String doctor_category) {
        this.doctor_category = doctor_category;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }
}
