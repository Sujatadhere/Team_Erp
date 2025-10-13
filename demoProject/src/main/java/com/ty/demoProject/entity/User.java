package com.ty.demoProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    private String email;   

    private String username;
    private String role;
    private String password;
    private String confirmpassword;

    public User() {
        super();
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getConfirmpassword() { return confirmpassword; }
    public void setConfirmpassword(String confirmpassword) { this.confirmpassword = confirmpassword; }

    @Override
    public String toString() {
        return "User [email=" + email + ", username=" + username + ", role=" + role
                + ", password=" + password + ", confirmpassword=" + confirmpassword + "]";
    }
}
