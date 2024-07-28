package com.tnp.springcoredemo.config;

import com.tnp.springcoredemo.comman.Coach;
import com.tnp.springcoredemo.comman.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
