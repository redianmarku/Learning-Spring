package com.tnp.employ.service;

import com.tnp.employ.dao.EmployDAO;
import com.tnp.employ.entities.Employ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeServiceImpl implements EmployeeService{
    EmployDAO employDAO;

    @Autowired
    public EmployeServiceImpl(EmployDAO employDAO){
        this.employDAO = employDAO;
    }

    @Override
    public List<Employ> findAll() {
        return this.employDAO.findAll();
    }

    @Override
    public Employ findById(int id) {
        return this.employDAO.findById(id);
    }

    @Override
    @Transactional
    public Employ save(Employ employ) {
        return employDAO.save(employ);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        employDAO.deleteById(id);
    }
}
