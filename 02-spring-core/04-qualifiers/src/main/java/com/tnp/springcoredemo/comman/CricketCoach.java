package com.tnp.springcoredemo.comman;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getWorkout(){
        return "Doo some workout.";
    }
}


