package com.chidi.joblisting.repository;

import com.chidi.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
