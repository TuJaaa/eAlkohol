package com.example.eAlkohol;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Comments")
public class Comments {
//    @OneToMany(mappedBy="comments")
//    private Set<Alcoholinfo> alcohol;

//    @OneToMany(mappedBy="comments")
//    private Set<User> users;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "ID_A")
    private int id_a;
    @Column(name = "ID_U")
    private int id_u;
    @Column(name = "RATE")
    private int rate;
    @Column(name = "BODY")
    private String body;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_a() {
        return id_a;
    }

    public void setId_a(int id_a) {
        this.id_a = id_a;
    }

    public int getId_u() {
        return id_u;
    }

    public void setId_u(int id_u) {
        this.id_u = id_u;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
