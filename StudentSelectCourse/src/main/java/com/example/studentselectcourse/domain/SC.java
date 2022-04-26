package com.example.studentselectcourse.domain;

public class SC {
    private String Sno;//学号；
    private int    Cno;//课程号；
    private int    Grade;//成绩；

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public int getCno() {
        return Cno;
    }

    public void setCno(int cno) {
        Cno = cno;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }

    @Override
    public String toString() {
        return "SC{" +
                "Sno='" + Sno + '\'' +
                ", Cno=" + Cno +
                ", Grade=" + Grade +
                '}';
    }
}
