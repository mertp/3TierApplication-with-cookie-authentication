package com.example.distrubuted_project.Repository;

import com.example.distrubuted_project.Models.Bonus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BonusRepository extends JpaRepository<Bonus, Integer> {
}