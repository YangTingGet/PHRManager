package com.group2.phrmanager.entity;

/**
 * @author 王见林
 */
public class MedicineEntity {
    public String Med_name;    // 药物名（主键）
    public int Med_num;     //药物编号
    public String Med_fun;     // 药物功能
    public String Med_forbid;  // 药物禁忌
    public String Med_compare; //药物对比信息

    public String getMed_name() {
        return Med_name;
    }

    public void setMed_name(String med_name) {
        Med_name = med_name;
    }

    public int getMed_num() {
        return Med_num;
    }

    public void setMed_num(int med_num) {
        Med_num = med_num;
    }

    public String getMed_fun() {
        return Med_fun;
    }

    public void setMed_fun(String med_fun) {
        Med_fun = med_fun;
    }

    public String getMed_forbid() {
        return Med_forbid;
    }

    public void setMed_forbid(String med_forbid) {
        Med_forbid = med_forbid;
    }

    public String getMed_compare() {
        return Med_compare;
    }

    public void setMed_compare(String med_compare) {
        Med_compare = med_compare;
    }
}
