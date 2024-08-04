package com.tnp.employ.dao;

import com.tnp.employ.entities.Employ;

import java.util.List;

public interface EmployDAO {
    List<Employ> findAll();
    Employ findById(int id);
    Employ save(Employ employ);
    void deleteById(int id);
}
