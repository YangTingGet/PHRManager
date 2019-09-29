package com.group2.entity;

public class UserEntity {
    public String user_name;//用户名
    public String Password;//密码
    public String Telphone;//电话
    public String Email;//邮箱
    public String id_card;//身份证号
    public String really_name;//真实姓名
    public String abs_num;//病历夹编号

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getTelphone() {
        return Telphone;
    }

    public void setTelphone(String telphone) {
        Telphone = telphone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
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
