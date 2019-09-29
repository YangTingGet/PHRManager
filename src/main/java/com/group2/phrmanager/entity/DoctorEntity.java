package com.group2.phrmanager.entity;

import java.util.Date;

/**
 * 医生实体类
 * @author 王见林
 */
public class DoctorEntity {
    public int Doctor_num; //医生编号（主键）
    public String Doctor_name; //医生姓名
    public String Doctor_category; //科室
    public Date Leave_time; //请假时间
    public int Status; //状态
    public String hospital_name; //所属医院名（外键）

    public int getDoctor_num() {
        return Doctor_num;
    }

    public void setDoctor_num(int doctor_num) {
        Doctor_num = doctor_num;
    }

    public String getDoctor_name() {
        return Doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        Doctor_name = doctor_name;
    }

    public String getDoctor_category() {
        return Doctor_category;
    }

    public void setDoctor_category(String doctor_category) {
        Doctor_category = doctor_category;
    }

    public Date getLeave_time() {
        return Leave_time;
    }

    public void setLeave_time(Date leave_time) {
        Leave_time = leave_time;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }
}
