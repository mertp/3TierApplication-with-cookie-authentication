package com.example.distrubuted_project.Controller;
//Last Version of the Project 3. Group 3
//Participants: Mert Can Pekdemir   b201202049
//              Halil İbrahim Üstün b201202012
//              Salih Doğaner       b201202015

import com.example.distrubuted_project.Models.Bonus;
import com.example.distrubuted_project.Models.Dept;
import com.example.distrubuted_project.Models.Emp;
import com.example.distrubuted_project.Models.Salgrade;
import com.example.distrubuted_project.Repository.BonusRepository;
import com.example.distrubuted_project.Repository.DeptRepository;
import com.example.distrubuted_project.Repository.EmpRepository;
import com.example.distrubuted_project.Repository.SalgradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class EmpController {
        @Autowired
        private EmpRepository empRepository;

        private DeptRepository departmentRepository;

        private BonusRepository bonusRepository;

        private SalgradeRepository salgradeRepository;

        public EmpController(EmpRepository empRepository,DeptRepository departmentRepository,BonusRepository bonusRepository,SalgradeRepository salgradeRepository) {
            this.empRepository = empRepository ;
            this.departmentRepository=departmentRepository;
            this.salgradeRepository=salgradeRepository;
            this.bonusRepository=bonusRepository;
        }

        @GetMapping("/")
        public String getIndex(Model model){
            List<Emp> eList = empRepository.findAll();

            model.addAttribute("eList", eList);
            return "index";
        }
    @GetMapping("/dept")
    public String getDepartments(Model model){
        List<Dept> dList = departmentRepository.findAll();
        model.addAttribute("dList", dList);
        return "departments";
    }
    @GetMapping("/bonus")
    public String getBonus(Model model){
        List<Bonus> bList =bonusRepository.findAll();
        model.addAttribute("bList",bList);
        return "bonus-page";
    }
    @GetMapping("/salgrade")
    public String getSalgrade(Model model){
        List<Salgrade> sList =salgradeRepository.findAll();
        model.addAttribute("sList",sList);
        return "salgrade-page";
    }


    @GetMapping("/addemployee")
    public String addEmployee(Model model){
        Emp emp = new Emp();
        model.addAttribute("emp", emp);
        return "_addemp";
    }

    @PostMapping("/add")
    public String addEmp(Emp emp, Model model){
        empRepository.save(emp);
        return "redirect:/";
    }
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Emp employee) {
        // save employee to database
        empRepository.save(employee);
        return "redirect:/";
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable ( value = "id") Integer id, Model model) {

        // get employee from the service
        for (Emp e : empRepository.findAll()) {
            if (e.getEmpno() == id) {
                model.addAttribute("employee", e);
                break;
            }
        }
        // set employee as a model attribute to pre-populate the form
        return "update_employee";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") Integer id) {
        // call delete employee method
        empRepository.deleteById(id);
        return "redirect:/";
    }
    @GetMapping("/access-denied")
    public String getAccessDenied(){
            return "accessDenied";
    }
}
