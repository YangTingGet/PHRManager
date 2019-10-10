package com.group2.phrmanager.entity;

import java.util.Date;

import static java.lang.System.out;

/**
 *
 */

public class HospitalUser {
    private String hospital_name;
    private String user_name;
    private int self_reg;
    private Date reg_time;
    private int doctor_num;

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getSelf_reg() {
        return self_reg;
    }

    public void setSelf_reg(int self_reg) {
        this.self_reg = self_reg;
    }

    public Date getReg_time() {
        return reg_time;
    }

    public void setReg_time(Date reg_time) {
        this.reg_time = reg_time;
    }

    public int getDoctor_num() {
        return doctor_num;
    }

    public void setDoctor_num(int doctor_num) {
        this.doctor_num = doctor_num;
    }
}
