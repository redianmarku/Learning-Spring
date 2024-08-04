package com.tnp.springcoredemo.comman;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    @PostConstruct
    public void post(){
        System.out.println("This runs after the injection on the container");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("This runs before the injection is removed on the container");
    }
}