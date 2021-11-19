package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.Angajat;

@Repository
public interface AngajatRepository extends JpaRepository<Angajat, Long>{

}
