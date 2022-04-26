package com.example.studentselectcourse.domain;

public class Course {
    private int Cno;//课程号
    private String Cname;//课程名字
    private int Cpno;//先修课程号；
    private int Ccredit;//学分

    public int getCno() {
        return Cno;
    }

    public void setCno(int cno) {
        Cno = cno;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public int getCpno() {
        return Cpno;
    }

    public void setCpno(int cpno) {
        Cpno = cpno;
    }

    public int getCcredit() {
        return Ccredit;
    }

    public void setCcredit(int ccredit) {
        Ccredit = ccredit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Cno=" + Cno +
                ", Cname='" + Cname + '\'' +
                ", Cpno=" + Cpno +
                ", Ccredit=" + Ccredit +
                '}';
    }
}
