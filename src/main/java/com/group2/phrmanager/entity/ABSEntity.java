package com.group2.entity;
import java.util.Date;
/**
 *病历夹实体类
 * @author 王见林 2019/9/26
 */

public class ABSEntity {
    public int abs_num; // 病历夹编号
    public String Me_name; //药物名
    public String Me_dosis; //剂量
    public Date Tr_time; //诊断时间
    public String puWe_thing; //待办事件
    public String User_name; //用户名

    public int getAbs_num() {
        return abs_num;
    }

    public void setAbs_num(int abs_num) {
        this.abs_num = abs_num;
    }

    public String getMe_name() {
        return Me_name;
    }

    public void setMe_name(String me_name) {
        Me_name = me_name;
    }

    public String getMe_dosis() {
        return Me_dosis;
    }

    public void setMe_dosis(String me_dosis) {
        Me_dosis = me_dosis;
    }

    public Date getTr_time() {
        return Tr_time;
    }

    public void setTr_time(Date tr_time) {
        Tr_time = tr_time;
    }

    public String getPuWe_thing() {
        return puWe_thing;
    }

    public void setPuWe_thing(String puWe_thing) {
        this.puWe_thing = puWe_thing;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }
}
