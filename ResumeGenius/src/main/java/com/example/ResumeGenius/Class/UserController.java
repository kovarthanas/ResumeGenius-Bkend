package com.example.ResumeGenius.Class;

import com.example.ResumeGenius.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class UserController {

    public class ProductController {

        private final UserService userService;

        @Autowired
        public ProductController(UserService userService) {
            this.userService = userService;
        }

        @PostMapping("/user")
        public ResponseEntity<User> saveProduct(@RequestBody User user) {
            User newProduct = userService.saveUser(user);
            return ResponseEntity.ok(newProduct);
        }

        @GetMapping("/users")
        public List<User> getAllUsers() {
            return userService.getAllUsers();
        }


        @GetMapping("/users/{userid}")
        public ResponseEntity<User> getProductById(@PathVariable String userId) {
            Optional<User> user = userService.getUserById(userId);
            return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        }

        @PutMapping("/users/{userid}")
        public ResponseEntity<User> updateUser(@PathVariable String userId, @RequestBody User user) {
            User updatedProduct = userService.updateUser(userId, user);
            return ResponseEntity.ok(updatedProduct);
        }

        @DeleteMapping("/users/{userid}")
        public ResponseEntity<String> deleteUser(@PathVariable String userId) {
            userService.deleteUser(userId);
            return ResponseEntity.ok("User deleted successfully");
        }
    }
}
