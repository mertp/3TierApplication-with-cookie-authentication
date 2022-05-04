package com.example.distrubuted_project.Repository;

import com.example.distrubuted_project.Models.Salgrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalgradeRepository extends JpaRepository<Salgrade, Integer> {
}