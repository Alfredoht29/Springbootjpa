package com.example.Proyecto.Completo.Repositories;

import com.example.Proyecto.Completo.Modelos.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User,Long> {
}
