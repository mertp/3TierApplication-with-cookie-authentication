package com.example.distrubuted_project.Repository;

import com.example.distrubuted_project.Models.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpRepository extends JpaRepository<Emp, Integer> {
@Query(value = "select * from emp e where e.ENAME like %:keyword% or e.JOB like %:keyword%",nativeQuery = true)
List<Emp> findByKeyword(@Param("keyword")String keyword );

}