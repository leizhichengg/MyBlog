package com.withlzc.backend.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 * @author Lei
 * @date 2019-07-30
 */

@Entity
@Table(name = "user")
public class User {

    private static final long serivalVersionUID = 1L;

    @NotBlank
    @Column(name = "username", unique = true, length = 10)
    private String username;

    /**
     * md5(username + original password + salt)
     */
    @NotBlank
    @Column(name = "password", length = 64)
    private String password;

    private String salt;

    @Column(name = "email", unique = true, length = 20)
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}