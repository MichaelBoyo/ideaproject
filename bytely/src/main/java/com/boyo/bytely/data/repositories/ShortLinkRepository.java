package com.boyo.bytely.data.repositories;

import com.boyo.bytely.data.models.ShortLink;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortLinkRepository extends MongoRepository<ShortLink, String> {
}
