package com.example.Proyecto.Completo.Repositories;

import com.example.Proyecto.Completo.Modelos.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UsersConfig {
    @Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository){
        return args -> {
            User test = new User("admin1"
                    ,"test@outlook.com"
                    ,"");
            usersRepository.saveAll(List.of(test));
        };
    }
}
