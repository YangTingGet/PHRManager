package com.group2.entity;

/**
 * @author 王见林
 */
public class HospitalEntity {
    public String hospital_name;// 医院名
    public String hospital_password;// 密码
    public String hospital_tel;//医院联系电话
    public String hospital_add;//医院地址
    public String hospital_major;//医院主治

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getHospital_password() {
        return hospital_password;
    }

    public void setHospital_password(String hospital_password) {
        this.hospital_password = hospital_password;
    }

    public String getHospital_tel() {
        return hospital_tel;
    }

    public void setHospital_tel(String hospital_tel) {
        this.hospital_tel = hospital_tel;
    }

    public String getHospital_add() {
        return hospital_add;
    }

    public void setHospital_add(String hospital_add) {
        this.hospital_add = hospital_add;
    }

    public String getHospital_major() {
        return hospital_major;
    }

    public void setHospital_major(String hospital_major) {
        this.hospital_major = hospital_major;
    }
}
