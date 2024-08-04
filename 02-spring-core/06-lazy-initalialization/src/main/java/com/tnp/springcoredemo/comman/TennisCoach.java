package com.tnp.springcoredemo.comman;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
class TennisCoach implements Coach{
    public TennisCoach(){
        System.out.println("-?- Loaded Component: " + getClass().getSimpleName());
    }
    @Override
    public String getWorkout(){
        return "Hit the ball";
    }
}