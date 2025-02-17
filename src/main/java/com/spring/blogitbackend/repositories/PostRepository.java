package com.spring.blogitbackend.repositories;

import com.spring.blogitbackend.entities.Post;
import com.spring.blogitbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByUser(User user);
    List<Post> findByCategory(String category);
}
