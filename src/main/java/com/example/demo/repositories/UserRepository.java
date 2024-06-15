package com.example.demo.repositories;

import com.example.demo.models.User;

public interface UserRepository {
    User save(User user);
    User findByName(String name);
}
