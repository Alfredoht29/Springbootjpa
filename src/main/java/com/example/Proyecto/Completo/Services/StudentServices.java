package com.example.Proyecto.Completo.Services;
import com.example.Proyecto.Completo.Modelos.Student;
import com.example.Proyecto.Completo.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    private final StudentRepository studentrepository;
    @Autowired
    public StudentServices(StudentRepository studentrepository){
        this.studentrepository=studentrepository;
    }

    public List<Student>getstudents(){
        return studentrepository.findAll();
    }
    public void addNewStudent(Student student){
        studentrepository.save(student);
    }
}
