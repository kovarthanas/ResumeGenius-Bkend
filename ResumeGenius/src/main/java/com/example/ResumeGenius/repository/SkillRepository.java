package com.example.ResumeGenius.repository;

import com.example.ResumeGenius.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, String> {
}