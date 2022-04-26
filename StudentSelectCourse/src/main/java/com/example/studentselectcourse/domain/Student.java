package com.example.studentselectcourse.domain;

public class Student {
    private String Sno;//学号
    private String Sname;//姓名
    private String Ssex;//性别
    private int Sage;//年龄
    private String Sdept;//院系

    public String getSno() {
        return Sno;
    }

    public String getSname() {
        return Sname;
    }

    public String getSsex() {
        return Ssex;
    }

    public int getSage() {
        return Sage;
    }

    public String getSdept() {
        return Sdept;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public void setSsex(String ssex) {
        Ssex = ssex;
    }

    public void setSage(int sage) {
        Sage = sage;
    }

    public void setSdept(String sdept) {
        Sdept = sdept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sno='" + Sno + '\'' +
                ", Sname='" + Sname + '\'' +
                ", Ssex='" + Ssex + '\'' +
                ", Sage=" + Sage +
                ", Sdept='" + Sdept + '\'' +
                '}';
    }
}
