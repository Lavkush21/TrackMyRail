package com.lavkush.TrackMyRail;


import com.lavkush.TrackMyRail.entity.TrainSchedule;
import com.lavkush.TrackMyRail.service.TrainSearchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/search")
public class TrainSearchController {


    private final TrainSearchService trainSearchService;


    private TrainSearchController(TrainSearchService trainSearchService) {
        this.trainSearchService = trainSearchService;
    }

    @GetMapping("/by-name")

    public List<TrainSchedule> findTrainByCode(@RequestParam String sourceCode, @RequestParam String destinationCode) {

        return trainSearchService.findTrainByStationCode(sourceCode.toUpperCase(), destinationCode.toUpperCase());
    }


    @GetMapping("/by-name")
    public List<TrainSchedule> findTrainByStationName(@RequestParam String sourceName, @RequestParam String destinationName) {


        return trainSearchService.findTrainByStationName(sourceName.toLowerCase(), destinationName.toUpperCase());
    }

}