package com.tnp.springcoredemo.controllers;

import com.tnp.springcoredemo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
    private Coach coach;

    @Autowired
    public CoachController(Coach coach){
        this.coach = coach;
    }

    @GetMapping("/getworkout")
    public String getworkout(){
        return coach.getWorkout();
    }
}
