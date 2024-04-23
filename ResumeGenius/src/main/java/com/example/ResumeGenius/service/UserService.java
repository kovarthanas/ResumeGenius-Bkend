package com.example.ResumeGenius.service;

import com.example.ResumeGenius.entity.User;
import com.example.ResumeGenius.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public Optional<User> getUserById(String userId) {
        return userRepository.findById(userId);
    }
    public User updateUser(String userId, User updatedUser) {
        Optional<User> existingProduct = userRepository.findById(userId);
        if (existingProduct.isPresent()) {
            User user = existingProduct.get();
            user.setRoleId(updatedUser.getRoleId());
            user.setTitle(updatedUser.getTitle());
            user.setFirstName(updatedUser.getFirstName());
            user.setCratedDate(updatedUser.getCratedDate());
            user.setLastName(updatedUser.getLastName());
            user.setEmail(updatedUser.getEmail());
            user.setSaltValue(updatedUser.getSaltValue());
            user.setModifiedDate(updatedUser.getModifiedDate());
            user.setStatus(updatedUser.getStatus());
            return userRepository.save(user);
        } else {
            throw new RuntimeException("User not found");
        }
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }



}
