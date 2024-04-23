package com.example.ResumeGenius.service;


import com.example.ResumeGenius.entity.User;
import com.example.ResumeGenius.entity.UserRole;
import com.example.ResumeGenius.repository.UserRepository;
import com.example.ResumeGenius.repository.UserRoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRoleService
{

    private final UserRoleRepository userRoleRepository;

    public UserRoleService(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    public UserRole saveUserRole(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    public List<UserRole> getAllUserRole() {
        return userRoleRepository.findAll();
    }
    public Optional<UserRole> getUserRoleById(String roleId) {
        return userRoleRepository.findById(roleId);
    }
    public UserRole updateUserRole(String roleId, UserRole updatedUserRole) {
        Optional<UserRole> existingUserRole = userRoleRepository.findById(roleId);
        if (existingUserRole.isPresent()) {
            UserRole userRole = existingUserRole.get();
            userRole.setRoleId(updatedUserRole.getRoleId());
            userRole.setRoleName(updatedUserRole.getRoleName());

            return userRoleRepository.save(userRole);
        } else {
            throw new RuntimeException("UserRole not found");
        }
    }

    public void deleteUser(String roleId) {
        userRoleRepository.deleteById(roleId);
    }
}
