package com.example.demo.repositories;

import com.example.demo.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class UserOracleRepository implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User save(User user) {
        System.out.println("Saving user to Oracle database");
        return entityManager.merge(user);
    }

    @Override
    public User findByName(String name) {
        return null;
    }
}
