package com.example.studentselectcourse.service.Imp;

import com.example.studentselectcourse.dao.StudentMapper;
import com.example.studentselectcourse.domain.Student;
import com.example.studentselectcourse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public Student getStudent(String Sno) {
        return studentMapper.getStudent(Sno);
    }
}
