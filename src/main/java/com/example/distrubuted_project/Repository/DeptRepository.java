package com.example.distrubuted_project.Repository;

import com.example.distrubuted_project.Models.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository<Dept, Integer> {
}