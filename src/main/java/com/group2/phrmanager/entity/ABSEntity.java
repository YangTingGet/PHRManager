package com.group2.phrmanager.entity;
import java.util.Date;
/**
 *病历夹实体类
 * @author 王见林 2019/9/26
 */

public class ABSEntity {
    private int abs_num; // 病历夹编号
    private String me_name; //药物名
    private String me_dosis; //剂量
    private Date tr_time; //诊断时间
    private String we_thing; //待办事件
    private String user_name; //用户名

    public int getAbs_num() {
        return abs_num;
    }

    public void setAbs_num(int abs_num) {
        this.abs_num = abs_num;
    }

    public String getMe_name() {
        return me_name;
    }

    public void setMe_name(String me_name) {
        this.me_name = me_name;
    }

    public String getMe_dosis() {
        return me_dosis;
    }

    public void setMe_dosis(String me_dosis) {
        this.me_dosis = me_dosis;
    }

    public Date getTr_time() {
        return tr_time;
    }

    public void setTr_time(Date tr_time) {
        this.tr_time = tr_time;
    }

    public String getWe_thing() {
        return we_thing;
    }

    public void setWe_thing(String we_thing) {
        this.we_thing = we_thing;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
