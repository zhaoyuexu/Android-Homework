package com.example.homework5.bean;

public class UserInfo {
    public long rowid;
    public int sn;
    public String name;
    public int age;
    public long height;
    public float weight;
    public boolean married;
    public String update_time;
    public String phone;
    public String pwd;

    public UserInfo() {
        rowid = 0L;
        sn = 0;
        name = "赵月旭";
        age = 20;
        height = 100L;
        weight = 50f;
        married = false;
        update_time = "";
        phone = "";
        pwd = "";
    }
}
