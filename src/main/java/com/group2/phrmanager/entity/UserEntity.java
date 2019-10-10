package com.group2.phrmanager.entity;

public class UserEntity {
    private String user_name;//用户名
    private String password;//密码
    private String telphone;//电话
    private String email;//邮箱
    private String id_card;//身份证号
    private String really_name;//真实姓名
    private String abs_num;//病历夹编号

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getReally_name() {
        return really_name;
    }

    public void setReally_name(String really_name) {
        this.really_name = really_name;
    }

    public String getAbs_num() {
        return abs_num;
    }

    public void setAbs_num(String abs_num) {
        this.abs_num = abs_num;
    }
}
