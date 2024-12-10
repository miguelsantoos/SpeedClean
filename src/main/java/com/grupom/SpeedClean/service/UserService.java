package com.grupom.SpeedClean.service;

import com.grupom.SpeedClean.model.User;
import com.grupom.SpeedClean.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepository repository;

    public User saveUser(User user) {
       return repository.save(user);
    }

    public User buscarUser(Long id) {
        return repository.getById(id);
    }

    public List<User> buscarTodosUser() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
/*
    public User editarUser(Long id, User userAtualizado) {
        User userAntigo = repository.getById(id);
        userAntigo.setEmail(userAtualizado.getEmail());
        userAntigo.setName(userAtualizado.getName());
        userAntigo.setTelephone(userAtualizado.getTelephone());
        userAntigo.setPassword(userAtualizado.getPassword());
        return repository.save(userAntigo);
    }
 */

}
