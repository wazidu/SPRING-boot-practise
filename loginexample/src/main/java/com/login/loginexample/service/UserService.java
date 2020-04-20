package com.login.loginexample.service;

import com.login.loginexample.entity.User;
import com.login.loginexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public void saveMyUser(User user)
    {
        userRepository.save(user);
    }

}
