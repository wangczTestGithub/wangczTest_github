package com.dzkj.entity;

public class Student {
    private  int sid;
    private String sname;
    private String ssex;
    private  int sage;
    private double sscore;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public double getSscore() {
        return sscore;
    }

    public void setSscore(double sscore) {
        this.sscore = sscore;
    }
}
