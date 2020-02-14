package com.example.javaonetomany.repository;

import com.example.javaonetomany.model.Post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long>{

    
}