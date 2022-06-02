package com.example.whatsappclone.Activities;

public class User {

    private String uid, name, phone, dpImage;

    public User() {
    }

    public User(String uid, String name, String phone, String dpImage) {
        this.uid = uid;
        this.name = name;
        this.phone = phone;
        this.dpImage = dpImage;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDpImage() {
        return dpImage;
    }

    public void setDpImage(String dpImage) {
        this.dpImage = dpImage;
    }
}
