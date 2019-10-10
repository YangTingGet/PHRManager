package com.group2.phrmanager.entity;

/**
 * @author 王见林
 */
public class MedicineEntity {
    private String med_name;    // 药物名（主键）
    private int med_num;     //药物编号
    private String med_fun;     // 药物功能
    private String med_forbid;  // 药物禁忌
    private String med_compare; //药物对比信息

    public String getMed_name() {
        return med_name;
    }

    public void setMed_name(String med_name) {
        this.med_name = med_name;
    }

    public int getMed_num() {
        return med_num;
    }

    public void setMed_num(int med_num) {
        this.med_num = med_num;
    }

    public String getMed_fun() {
        return med_fun;
    }

    public void setMed_fun(String med_fun) {
        this.med_fun = med_fun;
    }

    public String getMed_forbid() {
        return med_forbid;
    }

    public void setMed_forbid(String med_forbid) {
        this.med_forbid = med_forbid;
    }

    public String getMed_compare() {
        return med_compare;
    }

    public void setMed_compare(String med_compare) {
        this.med_compare = med_compare;
    }
}
