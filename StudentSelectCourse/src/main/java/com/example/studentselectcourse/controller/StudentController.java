package com.example.studentselectcourse.controller;

import com.example.studentselectcourse.dao.StudentMapper;
import com.example.studentselectcourse.domain.Student;
import com.example.studentselectcourse.service.Imp.AddStudentServiceImp;
import com.example.studentselectcourse.service.Imp.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.rmi.server.ServerNotActiveException;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentServiceImp studentServiceImp;

    @Autowired
    private AddStudentServiceImp addStudentServiceImp;

    @RequestMapping(value = "/testBoot/getStudent/{Sno}",method = RequestMethod.GET)
    public String getStudent(@PathVariable("Sno") String Sno,Model model){
        Student student = studentServiceImp.getStudent(Sno);
        if(student != null){
            model.addAttribute("student",student);
        }
        return "StudentSelectCourse";
    }

    @RequestMapping(value = "/testBoot/getStudent1/",method = RequestMethod.GET)
    public String getStudent1(@RequestParam("Sno") String Sno, Model model){
        Student student = studentServiceImp.getStudent(Sno);
        if(student != null){
            model.addAttribute("student",student);
        }
        return "StudentSelectCourse";
    }

   @RequestMapping(value = "/testBoot/addStudent",method = RequestMethod.POST)
   public String addStudent(Student student){
        addStudentServiceImp.addStudent(student);
        if(student != null){
            return "index";
        }else{
            return "error";
        }
        //eturn "redirect:/testBoot/getStudent/{student.Sno}";
   }

   @RequestMapping(value = "/testBoot/redirectMethod",method = RequestMethod.GET)
   public String redirectMethod(){
        return "index";
   }

}
