package com.example.studentselectcourse.dao;

import com.example.studentselectcourse.domain.Student;

public interface StudentMapper {
    Student getStudent(String Sno);
    void addStudent(Student student);
}
