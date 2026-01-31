package com.lavkush.TrackMyRail.controller;

import com.lavkush.TrackMyRail.entity.TrainSchedule;
import com.lavkush.TrackMyRail.service.TrainScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/train-schedules")
public class TrainScheduleController {

    private final TrainScheduleService trainScheduleService;

    public TrainScheduleController(TrainScheduleService trainScheduleService) {
        this.trainScheduleService = trainScheduleService;
    }

    @GetMapping
    public List<TrainSchedule> getAllTrainSchedules() {
        return trainScheduleService.getAllTrainSchedules();
    }

    @PostMapping
    public TrainSchedule addTrainSchedule(@RequestBody TrainSchedule trainSchedule) {
        return trainScheduleService.addTrainSchedule(trainSchedule);
    }

    @GetMapping("/{id}")
    public TrainSchedule getTrainScheduleById(@PathVariable Long id) {
        return trainScheduleService.getTrainScheduleById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTrainSchedule(@PathVariable Long id) {
        trainScheduleService.deleteTrainSchedule(id);
    }
}