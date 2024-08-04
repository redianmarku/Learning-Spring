package com.tnp.springcoredemo.comman;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class FootballCoach implements Coach{
    @Override
    public String getWorkout(){
        return "Playy football";
    }
}