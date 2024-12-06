package com.grupom.SpeedClean.service;

import com.grupom.SpeedClean.model.User;
import com.grupom.SpeedClean.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    IUserRepository repository;

    public User saveUser(User user) {
       return repository.save(user);
    }
}
