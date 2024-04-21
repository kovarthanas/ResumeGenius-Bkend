package com.example.ResumeGenius.repository;

import com.example.ResumeGenius.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {
}