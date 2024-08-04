package com.tnp.springcoredemo.comman;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Lazy
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("-?- Loaded Component: " + getClass().getSimpleName());
    }
    @Override
    public String getWorkout(){
        return "Doo some workout.";
    }
}


