package com.aoodax.platform.simple.persistence.tag;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TagRepository extends MongoRepository<TagEntity, String>, CustomizedTagRepository {

    Optional<TagEntity> findByUid(String uid);

    Optional<TagEntity> findByName(String name);

    Optional<TagEntity> findByNameIgnoreCase(String name);

}
