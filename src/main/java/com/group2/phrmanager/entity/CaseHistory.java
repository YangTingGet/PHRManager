package com.group2.phrmanager.entity;

import java.util.Date;

import static java.lang.System.out;

/**
 *
 */

public class CaseHistory {
    private int case_id;
    private Date case_date;
    private String case_content;
    private String evalution;
    private int evalution_state;
    private String account;
    private String user_name;
    private int doctor_num;

    public int getCase_id() {
        return case_id;
    }

    public void setCase_id(int case_id) {
        this.case_id = case_id;
    }

    public Date getCase_date() {
        return case_date;
    }

    public void setCase_date(Date case_date) {
        this.case_date = case_date;
    }

    public String getCase_content() {
        return case_content;
    }

    public void setCase_content(String case_content) {
        this.case_content = case_content;
    }

    public String getEvalution() {
        return evalution;
    }

    public void setEvalution(String evalution) {
        this.evalution = evalution;
    }

    public int getEvalution_state() {
        return evalution_state;
    }

    public void setEvalution_state(int evalution_state) {
        this.evalution_state = evalution_state;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getDoctor_num() {
        return doctor_num;
    }

    public void setDoctor_num(int doctor_num) {
        this.doctor_num = doctor_num;
    }
}
