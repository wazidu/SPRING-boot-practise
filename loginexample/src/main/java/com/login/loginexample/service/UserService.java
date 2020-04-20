package com.login.loginexample.service;

import com.login.loginexample.entity.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    public void saveMyUser(User user)
    {
        save(user)
    }

}
