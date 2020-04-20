package com.login.loginexample.repository;


import com.login.loginexample.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
