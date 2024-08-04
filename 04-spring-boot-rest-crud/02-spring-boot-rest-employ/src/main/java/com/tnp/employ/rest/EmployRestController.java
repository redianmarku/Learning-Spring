package com.tnp.employ.rest;

import com.tnp.employ.dao.EmployDAO;
import com.tnp.employ.entities.Employ;
import com.tnp.employ.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployRestController {
    EmployeeService employeeService;

    @Autowired
    public EmployRestController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List <Employ> allEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employ getEmployById(@PathVariable(name = "employeeId") int employeeId){
        return employeeService.findById(employeeId);
    }

    @PostMapping("/employees")
    public Employ addEmployee(@RequestBody Employ employ){
        employ.setId(0);
        Employ addedEmploy = employeeService.save(employ);
        return addedEmploy;
    }
}
