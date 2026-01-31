package com.lavkush.TrackMyRail.service;

import com.lavkush.TrackMyRail.entity.TrainSchedule;
import com.lavkush.TrackMyRail.repo.TrainScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainScheduleService {

    private final TrainScheduleRepository trainScheduleRepository;

    public TrainScheduleService(TrainScheduleRepository trainScheduleRepository) {
        this.trainScheduleRepository = trainScheduleRepository;
    }

    public List<TrainSchedule> getAllTrainSchedules() {
        return trainScheduleRepository.findAll();
    }

    public TrainSchedule addTrainSchedule(TrainSchedule trainSchedule) {
        return trainScheduleRepository.save(trainSchedule);
    }

    public TrainSchedule getTrainScheduleById(Long id) {
        return trainScheduleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TrainSchedule not found with id: " + id));
    }

    public void deleteTrainSchedule(Long id) {
        trainScheduleRepository.deleteById(id);
    }
}