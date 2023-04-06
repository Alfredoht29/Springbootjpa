package com.example.Proyecto.Completo.Services;

import com.example.Proyecto.Completo.Modelos.User;
import com.example.Proyecto.Completo.Repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServices {
    private final UsersRepository  usersRepository;
    @Autowired
    public UserServices(UsersRepository usersRepository){this.usersRepository=usersRepository;}
    public List<User>getUsers(){return usersRepository.findAll();}
}
