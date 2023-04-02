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
                    ,"xd123");
            User test2 = new User("admin2"
            ,"imscared@gmail.com"
            ,"xdont123");
            usersRepository.saveAll(List.of(test,test2));
        };
    }
}
