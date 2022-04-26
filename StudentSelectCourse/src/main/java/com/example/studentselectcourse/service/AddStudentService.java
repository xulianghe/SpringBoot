package com.example.studentselectcourse.service;

import com.example.studentselectcourse.domain.Student;
import org.springframework.stereotype.Service;

@Service
public interface AddStudentService {
    public void addStudent(Student student);
}
