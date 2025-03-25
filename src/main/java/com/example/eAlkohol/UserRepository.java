package com.example.eAlkohol;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT a FROM Alcoholinfo a")
    List<Alcoholinfo> findAllAlcohols();

    @Query("SELECT a FROM Alcoholinfo a WHERE a.id = :id")
    Alcoholinfo findAlcoholById(Long id);
}