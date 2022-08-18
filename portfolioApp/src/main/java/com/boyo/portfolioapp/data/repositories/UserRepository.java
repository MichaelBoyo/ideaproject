package com.boyo.portfolioapp.data.repositories;

import com.boyo.portfolioapp.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findUserByUsername(String username);
    Optional<User> findUserByEmail(String email);
}
