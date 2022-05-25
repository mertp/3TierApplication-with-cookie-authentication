package com.example.distrubuted_project.Repository;

import com.example.distrubuted_project.Models.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpService  {
    @Autowired
    private EmpRepository empRepository;
    public List<Emp> findByKeyword(String keyword){
        return empRepository.findByKeyword(keyword);
    }
}
