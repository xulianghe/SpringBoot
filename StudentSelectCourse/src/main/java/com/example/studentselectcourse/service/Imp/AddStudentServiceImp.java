package com.example.studentselectcourse.service.Imp;

import com.example.studentselectcourse.dao.StudentMapper;
import com.example.studentselectcourse.domain.Student;
import com.example.studentselectcourse.service.AddStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddStudentServiceImp implements AddStudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }
}
