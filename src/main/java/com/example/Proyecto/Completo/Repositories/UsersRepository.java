package com.example.Proyecto.Completo.Repositories;

import com.example.Proyecto.Completo.Modelos.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
}
