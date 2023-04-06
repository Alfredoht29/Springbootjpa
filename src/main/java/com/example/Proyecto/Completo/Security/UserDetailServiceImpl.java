package com.example.Proyecto.Completo.Security;

import com.example.Proyecto.Completo.Repositories.UsersRepository;
import com.example.Proyecto.Completo.Modelos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UsersRepository usuarioRepository;
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
       User usuario = usuarioRepository
                .findByEmail(email)
                .orElseThrow(()-> new UsernameNotFoundException("el usuario con email "+ email + " No existe"));
        return new UserDetailsImpl(usuario);
    }
}
