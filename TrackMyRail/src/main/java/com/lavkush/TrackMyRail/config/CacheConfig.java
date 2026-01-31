package com.lavkush.TrackMyRail.config;

import com.lavkush.TrackMyRail.entity.TrainSchedule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {

    @Bean(name = "lavkush")
    public TrainSchedule getInstance() {
        return new TrainSchedule();
    }
}