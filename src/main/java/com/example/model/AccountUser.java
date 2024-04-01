package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class AccountUser {
    @Id
    @Column(name = "login", unique = true, updatable = false)
    private String login;
    @Column(name = "email", updatable = false)
    private String email;
    @Column(name = "password", updatable = false)
    private String password;

    public AccountUser() {
    }

    public AccountUser(String login, String email, String password){
        this.login = login;
        this.email = email;
        this.password = password;
    }

    public String getLogin(){
        return login;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }
}
