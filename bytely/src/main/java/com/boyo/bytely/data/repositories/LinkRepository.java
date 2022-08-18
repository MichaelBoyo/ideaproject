package com.boyo.bytely.data.repositories;

import com.boyo.bytely.data.models.Link;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends MongoRepository<Link,String> {
    Link findLinkByUrl(String url);
}
