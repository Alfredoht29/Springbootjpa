package com.example.Proyecto.Completo.Controllers;

import com.example.Proyecto.Completo.Modelos.Student;
import com.example.Proyecto.Completo.Modelos.User;
import com.example.Proyecto.Completo.Services.StudentServices;
import com.example.Proyecto.Completo.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "student")
public class StudentController {
    private final StudentServices studentservice;
    private final UserServices userServices;
    @Autowired
    public StudentController(StudentServices studentservice,UserServices userServices){
        this.studentservice=studentservice;
        this.userServices=userServices;
    }

    @GetMapping
    public List<Student> students(){
        return studentservice.getstudents();
    }

    @GetMapping(path="user")
    public List<User> users(){return userServices.getUsers();}

    @PostMapping(path = "post")
    public void postaction(@RequestBody Student student){
        studentservice.addNewStudent(student);
    }
}
