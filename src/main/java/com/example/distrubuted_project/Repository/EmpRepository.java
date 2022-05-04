package com.example.distrubuted_project.Repository;

import com.example.distrubuted_project.Models.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Emp, Integer> {
}