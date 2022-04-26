package com.example.studentselectcourse.service;

import com.example.studentselectcourse.domain.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    public Student getStudent(String Sno);
}
