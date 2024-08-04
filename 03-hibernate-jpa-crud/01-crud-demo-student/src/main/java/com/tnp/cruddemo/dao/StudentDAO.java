package com.tnp.cruddemo.dao;

import com.tnp.cruddemo.entities.Student;

import java.util.List;

public interface StudentDAO {
     void save(Student student);
     void updateStudent(Student student);
     void deleteStudent(int id);
     Student findStudent(int id);
     List<Student> findAll();
     int deleteAll();
     List<Student> findByLastName(String lname);



}
