package com.tnp.springcoredemo.comman;

import org.springframework.stereotype.Component;

@Component
class TennisCoach implements Coach{
    @Override
    public String getWorkout(){
        return "Hit the ball";
    }
}