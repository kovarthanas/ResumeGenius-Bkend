package com.example.ResumeGenius.repository;

import com.example.ResumeGenius.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, String> {
}