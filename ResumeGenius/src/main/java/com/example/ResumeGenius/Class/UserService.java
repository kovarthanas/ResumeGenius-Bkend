package com.example.ResumeGenius.Class;

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
            User.setRoleId(updatedUser.getRoleId());
            User.setTitle(updatedUser.getTitle());
            User.setFirstName(updatedUser.getFirstName());
            User.setCratedDate(updatedUser.getCratedDate());
            User.setLastName(updatedUser.getLastName());
            User.setEmail(updatedUser.getEmail());
            User.setSaltValue(updatedUser.getSaltValue());
            User.setModifiedDate(updatedUser.getModifiedDate());
            User.setStatus(updatedUser.getStatus());
            return userRepository.save(user);
        } else {
            throw new RuntimeException("User not found");
        }
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }



}
