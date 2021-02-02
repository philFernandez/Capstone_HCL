package com.hcl.capstone.service;

import com.hcl.capstone.model.User;
import com.hcl.capstone.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User registerRegularUser(String username, String password, String email) {
        User user = new User(username, password, email);
        return registerRegularUser(user);
    }

    // need to do exception handling i think, if username is already taken
    public User registerRegularUser(User user) {
        return repository.save(user);
    }

    public User registerAdminUser(String username, String password, String email) {
        User user = new User(username, password, email);
        return registerRegularUser(user);
    }

    // need to do exception handling i think, if username is already taken
    public User registerAdminUser(User user) {
        return repository.save(user);
    }

    public User getUserByName(String username) {
        return repository.findByUsername(username);
    }

    public void saveUser(User user) {
        repository.save(user);
    }
}

