package com.example.ResumeGenius.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "user")
public class User {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;
    private String roleId;
    private String title;
    private String firstName;
    private String lastName;
    private String email;
    private String saltValue;
    private String cratedDate;
    private String modifiedDate;
    private String status;

    //getter
    public String getUserId() {
        return userId;
    }
    public String getRoleId() {
        return roleId;
    }
    public String getTitle() {
        return title;
    }
    public String getEmail() {
        return email;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getCratedDate() {
        return cratedDate;
    }
    public String getSaltValue() {
        return saltValue;
    }
    public String getModifiedDate() {
        return modifiedDate;
    }
    public String getStatus() {
        return status;
    }


    //setter
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public  void setRoleId(String roleId) {
      this.roleId = roleId;
    }
    public  void setTitle(String title) {
        this.title = title;
    }
    public  void setFirstName(String firstName) {
       this.firstName = firstName;
    }
    public  void setCratedDate(String cratedDate) {
        this.cratedDate = cratedDate;
    }
    public  void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public  void setEmail(String email) {
       this.email = email;
    }
    public  void setSaltValue(String saltValue) {
        this.saltValue = saltValue;
    }
    public  void setModifiedDate(String modifiedDate) {
       this.modifiedDate = modifiedDate;
    }
    public  void setStatus(String status) {
        this.status = status;
    }

}