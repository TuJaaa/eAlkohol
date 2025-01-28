package com.example.eAlkohol;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {
//    @ManyToOne
//    @JoinColumn(name="id_u", nullable=false)
//    private Comments comments;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id_user;

    @Column(name = "NAME")
    private String name;
    @Column(name = "USER_PASSWORD")
    private String userPassword;
    @Column(name = "role")
    private String role;

    public int getId() {
        return id_user;
    }

    public void setId(int id) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
