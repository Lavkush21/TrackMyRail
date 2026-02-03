package com.lavkush.TrackMyRail.controller;

import com.lavkush.TrackMyRail.entity.Train;
import com.lavkush.TrackMyRail.service.TrainService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
@CrossOrigin(origins = "http://localhost:3000")
public class TrainController {

    private final TrainService trainService;

    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @GetMapping
    public List<Train> getAllTrains() {
        return trainService.getAllTrains();
    }

    @PostMapping
    public ResponseEntity<Train> addTrain(@RequestBody Train train) {
        Train savedTrain = trainService.addTrain(train);
        return ResponseEntity.ok(savedTrain);
    }
}