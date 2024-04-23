package com.example.ResumeGenius.controller;


import com.example.ResumeGenius.entity.Skill;
import com.example.ResumeGenius.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class SkillController {
    private final SkillService skillService;

    @Autowired
    public SkillController(SkillService skillService){
        this.skillService = skillService;
    }

    @PostMapping("/skill")
    public ResponseEntity<Skill> saveSkill(@RequestBody Skill skill) {
        Skill newSkill = skillService.saveSkill(skill);
        return ResponseEntity.ok(newSkill);
    }

    @GetMapping("/skills")
    public List<Skill> getAllSkills() {
        return skillService.getAllSkills();
    }


    @GetMapping("/skills/{skillId}")
    public ResponseEntity<Skill> getSkillById(@PathVariable String skillId) {
        Optional<Skill> skill = skillService.getSkillById(skillId);
        return skill.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/skills/{skillId}")
    public ResponseEntity<Skill> updateSkill(@PathVariable String skillId, @RequestBody Skill skill) {
        Skill updatedSkill = skillService.updateSkill(skillId, skill);
        return ResponseEntity.ok(updatedSkill);
    }

    @DeleteMapping("/skills/{skillId}")
    public ResponseEntity<String> deleteSkill(@PathVariable String skillId) {
        skillService.deleteSkill(skillId);
        return ResponseEntity.ok("skill deleted successfully");
    }
}
