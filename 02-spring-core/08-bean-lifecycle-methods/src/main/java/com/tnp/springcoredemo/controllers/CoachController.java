package com.tnp.springcoredemo.controllers;

import com.tnp.springcoredemo.comman.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
    private Coach coach;

   @Autowired
   public CoachController(@Qualifier("tennisCoach") Coach coach){this.coach = coach;}

    @GetMapping("/getworkout")
    public String getworkout(){
        return coach.getWorkout();
    }
}
