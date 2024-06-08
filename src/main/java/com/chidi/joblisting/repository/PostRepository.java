package com.chidi.joblisting.repository;

import com.chidi.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {




}
