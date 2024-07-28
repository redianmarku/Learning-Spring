package com.tnp.springcoredemo.comman;

public class SwimCoach implements Coach{
    public SwimCoach(){
        System.out.println("Swim coach injected");
    }
    @Override
    public String getWorkout() {
        return "Swim 100 meters to warm up.";
    }
}
