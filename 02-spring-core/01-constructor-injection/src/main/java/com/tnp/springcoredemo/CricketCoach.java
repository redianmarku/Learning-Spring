package com.tnp.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getWorkout(){
        return "Doo some workout.";
    }
}
