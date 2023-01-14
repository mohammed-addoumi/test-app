package com.testApp.testApp.dao;

import com.testApp.testApp.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserProvider {
    Optional<User> findUserById(Long id);

    List<User> getAllUsers();

    User save(User user);
}
