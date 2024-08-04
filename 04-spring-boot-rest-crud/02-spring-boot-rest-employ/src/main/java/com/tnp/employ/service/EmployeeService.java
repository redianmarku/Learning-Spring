package com.tnp.employ.service;

import com.tnp.employ.entities.Employ;

import java.util.List;

public interface EmployeeService {
     List<Employ> findAll();
     Employ findById(int id);
     Employ save(Employ employ);
     void deleteById(int id);

}
