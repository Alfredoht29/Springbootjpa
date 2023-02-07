package com.example.Proyecto.Completo.Repositories;

import com.example.Proyecto.Completo.Modelos.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
