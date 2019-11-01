package com.beloushkin.regexample.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.beloushkin.regexample.model.User;

@Repository("userRepository")
public interface UserRepositoryMain extends CrudRepository<User, String> {
    User findByEmailIdIgnoreCase(String emailId);
}