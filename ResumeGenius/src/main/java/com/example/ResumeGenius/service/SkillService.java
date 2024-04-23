package com.example.ResumeGenius.service;

import com.example.ResumeGenius.entity.Skill;
import com.example.ResumeGenius.repository.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {


    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }
    public Optional<Skill> getSkillById(String skillId) {
        return skillRepository.findById(skillId);
    }
    public Skill updateSkill(String skillId, Skill updatedSkill) {
        Optional<Skill> existingSkill = skillRepository.findById(skillId);
        if (existingSkill.isPresent()) {
            Skill skill = existingSkill.get();
            skill.setSkillId(updatedSkill.getSkillId());
            skill.setSkill(updatedSkill.getSkill());

            return skillRepository.save(skill);
        } else {
            throw new RuntimeException("skill not found");
        }
    }

    public void deleteSkill(String skillId) {
        skillRepository.deleteById(skillId);
    }
}
