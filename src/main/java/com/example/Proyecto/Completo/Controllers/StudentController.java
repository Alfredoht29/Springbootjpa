package com.example.Proyecto.Completo.Controllers;

import com.example.Proyecto.Completo.Modelos.Student;
import com.example.Proyecto.Completo.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class StudentController {
    private final StudentServices studentservice;
    @Autowired
    public StudentController(StudentServices studentservice){
        this.studentservice=studentservice;
    }

    @GetMapping
    public List<Student> students(){
        return studentservice.getstudents();
    }

    @PostMapping(path = "post")
    public void postaction(@RequestBody Student student){
        studentservice.addNewStudent(student);
    }
}
