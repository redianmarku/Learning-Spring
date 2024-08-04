package com.tnp.demo.rest;

import com.tnp.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    List <Student> students = new ArrayList<>();

    @PostConstruct
    public void loadData(){
        Student newStd = new Student("Redian", "Marku");
        this.students.add(newStd);
        this.students.add(newStd);
        this.students.add(newStd);
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return this.students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        if(studentId < 0 || studentId > this.students.size()){
            throw new StudentNotFoundExeption("Student not found with id " + studentId);
        }
        return this.students.get(studentId);
    }




}

