package com.example.Proyecto.Completo.Repositories;

import com.example.Proyecto.Completo.Modelos.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student test = new Student(
                    "Test",
                    "Test@hotmail.com",
                    LocalDate.of(2000, Month.JANUARY,5)
            );
            Student test2 = new Student(
                    "Test2",
                    "Test2@hotmail.com",
                    LocalDate.of(2001, Month.JANUARY,5)
            );
            Student test3 = new Student(
                    "Test2",
                    "Test2@hotmail.com",
                    LocalDate.of(2000, Month.JANUARY,5)
            );
            studentRepository.saveAll( List.of(test,test2,test3) );
        };
    }
}
