package com.group2.phrmanager.entity;

public class AdviceEntity {
    private String h_title; //文章名
    private String h_body; //文章内容
    private String h_id;
    private String h_class;
    private int h_state;
    private  String hospital_name;
    public String getH_title() {
        return h_title;
    }

    public void setH_title(String h_title) {
        this.h_title = h_title;
    }

    public String getH_body() {
        return h_body;
    }

    public void setH_body(String h_body) {
        this.h_body = h_body;
    }

    public String getH_id() {
        return h_id;
    }

    public void setH_id(String h_id) {
        this.h_id = h_id;
    }

    public String getH_class() {
        return h_class;
    }

    public void setH_class(String h_class) {
        this.h_class = h_class;
    }

    public int getH_state() {
        return h_state;
    }

    public void setH_state(int h_state) {
        this.h_state = h_state;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }
}
