package com.lavkush.TrackMyRail.service;


import com.lavkush.TrackMyRail.entity.TrainSchedule;
import com.lavkush.TrackMyRail.repo.TrainScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainSearchService {


    private  TrainScheduleRepository  trainScheduleRepository;

    public  TrainSearchService(TrainScheduleRepository trainScheduleRepository) {
        this.trainScheduleRepository = trainScheduleRepository;

    }

    public List<TrainSchedule> findTrainByStationCode(String sourceCode, String   destinationCode) {
        return
    }

    public List<TrainSchedule> findTrainByStationName(String sourceName, String destinationName) {
    }
}
