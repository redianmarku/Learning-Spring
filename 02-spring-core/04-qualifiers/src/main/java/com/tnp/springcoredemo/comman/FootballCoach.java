package com.tnp.springcoredemo.comman;

import org.springframework.stereotype.Component;

@Component
class FootballCoach implements Coach{
    @Override
    public String getWorkout(){
        return "Playy football";
    }
}