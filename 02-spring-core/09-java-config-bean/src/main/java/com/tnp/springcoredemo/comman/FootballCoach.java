package com.tnp.springcoredemo.comman;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
class FootballCoach implements Coach{
    public FootballCoach(){
        System.out.println("-?- Loaded Component: " + getClass().getSimpleName());
    }
    @Override
    public String getWorkout(){
        return "Playy football";
    }


}