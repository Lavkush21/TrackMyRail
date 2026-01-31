package com.lavkush.TrackMyRail.controller;

import com.lavkush.TrackMyRail.entity.TrainSchedule;
import com.lavkush.TrackMyRail.service.TrainSearchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
public class TrainSearchController {

    private final TrainSearchService trainSearchService;

    public TrainSearchController(TrainSearchService trainSearchService) {
        this.trainSearchService = trainSearchService;
    }

    @GetMapping("/by-code")
    public List<TrainSchedule> findTrainByCode(@RequestParam String sourceCode, @RequestParam String destinationCode) {
        return trainSearchService.findTrainByStationCode(sourceCode.toUpperCase(), destinationCode.toUpperCase());
    }

    @GetMapping("/by-name")
    public List<TrainSchedule> findTrainByStationName(@RequestParam String sourceName, @RequestParam String destinationName) {
        return trainSearchService.findTrainByStationName(sourceName, destinationName);
    }
}