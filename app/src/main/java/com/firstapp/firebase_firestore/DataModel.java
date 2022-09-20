package com.firstapp.firebase_firestore;

public class DataModel {
    String name;
    String mail;
    String mobile;
    String gender;
    String state;

    public DataModel(String name, String mail, String mobile, String gender, String state) {
        this.name = name;
        this.mail = mail;
        this.mobile = mobile;
        this.gender = gender;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
