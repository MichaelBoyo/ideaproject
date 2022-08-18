package com.boyo.portfolioapp.data.repositories;

import com.boyo.portfolioapp.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserArchive extends MongoRepository<User, String> {
}
