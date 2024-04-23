package com.example.ResumeGenius.controller;

import com.example.ResumeGenius.entity.User;
import com.example.ResumeGenius.entity.UserRole;
import com.example.ResumeGenius.service.UserRoleService;
import com.example.ResumeGenius.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1")
public class UserRoleController {
    private final UserRoleService userRoleService;

    @Autowired
    public UserRoleController(UserRoleService userRoleService){
        this.userRoleService = userRoleService;
    }

    @PostMapping("/userRole")
    public ResponseEntity<UserRole> saveUserRole(@RequestBody UserRole userRole) {
        UserRole newUserRole = userRoleService.saveUserRole(userRole);
        return ResponseEntity.ok(newUserRole);
    }

    @GetMapping("/userRoles")
    public List<UserRole> getAllUserRole() {
        return userRoleService.getAllUserRole();
    }


    @GetMapping("/userRoles/{roleId}")
    public ResponseEntity<UserRole> getUserById(@PathVariable String roleId) {
        Optional<UserRole> userRole = userRoleService.getUserRoleById(roleId);
        return userRole.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/userRoles/{roleId}")
    public ResponseEntity<UserRole> updateUserRole(@PathVariable String roleId, @RequestBody UserRole userRole) {
        UserRole updatedUserRole = userRoleService.updateUserRole(roleId, userRole);
        return ResponseEntity.ok(updatedUserRole);
    }

    @DeleteMapping("/userRoles/{roleId}")
    public ResponseEntity<String> deleteUserRole(@PathVariable String roleId) {
        userRoleService.deleteUser(roleId);
        return ResponseEntity.ok("User Role deleted successfully");
    }
}
