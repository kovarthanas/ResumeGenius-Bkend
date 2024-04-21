package com.example.ResumeGenius.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id", nullable = false, length = 20)
    public String userId;
    public String roleId;
    private String title;
    private String firstName;
    private String lastName;
    private String email;
    private String saltValue;
    private String cratedDate;
    private String modifiedDate;
    private String status;

    public User() {
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getRoleId() {
        return roleId;
    }

    public static void setRoleId(String roleId) {
     //  this.roleId = roleId;
    }


    public String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
       // this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
       // this.firstName = firstName;
    }

    public String getCratedDate() {
        return cratedDate;
    }

    public static void setCratedDate(String cratedDate) {
       // this.cratedDate = cratedDate;
    }

    public String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
      //  this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
       // this.email = email;
    }

    public String getSaltValue() {
        return saltValue;
    }

    public static void setSaltValue(String saltValue) {
      //  this.saltValue = saltValue;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public static void setModifiedDate(String modifiedDate) {
     //  this.modifiedDate = modifiedDate;
    }

    public String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
     //   this.status = status;
    }
}