package com.jcs.fr.entities;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long uid;

    @Column(name="user_name",nullable = false, length = 35)
    private String userName;

    @Column(nullable = false, length = 64)
    private String password;

    @Column(nullable = false, unique = true, length = 64)
    private String email;

    public Account() {
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
}
