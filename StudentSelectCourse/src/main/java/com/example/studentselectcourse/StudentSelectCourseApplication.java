package com.example.studentselectcourse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.studentselectcourse.dao")
public class StudentSelectCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentSelectCourseApplication.class, args);
    }

}
