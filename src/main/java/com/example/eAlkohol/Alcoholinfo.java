package com.example.eAlkohol;
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Alcohol")
public class Alcoholinfo {
    @ManyToOne
    @JoinColumn(name="id_a", nullable=false)
    private Comments comments;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id_alcohol;

    @Column(name = "NAME")
    private String name;
    @Column(name = "BRAND")
    private String brand;
    @Column(name = "PROCENTAGE")
    private double procentage;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "DESCRIPTION")
    private String description;

    public int getId() {
        return id_alcohol;
    }

    public void setId(int id) {
        this.id_alcohol = id_alcohol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getProcentage() {
        return procentage;
    }

    public void setProcentage(double procentage) {
        this.procentage = procentage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
