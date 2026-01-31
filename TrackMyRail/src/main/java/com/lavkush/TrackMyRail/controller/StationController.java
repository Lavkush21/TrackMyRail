package com.lavkush.TrackMyRail.controller;

import com.lavkush.TrackMyRail.entity.Station;
import com.lavkush.TrackMyRail.service.StationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stations")
public class StationController {

    private final StationService stationService;

    public StationController(StationService stationService) {
        this.stationService = stationService;

    }

    @GetMapping
    public List<Station> getAllStations() {
        return stationService.getAllStations();

    }

    @PostMapping
    public Station addStation(@RequestBody Station station) {
        return stationService.addStation(station);

    }

    @GetMapping("/{id}")
    public Station getStationById(@PathVariable Long id) {

        return stationService.getStationById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStation(@PathVariable Long id) {

        stationService.deleteStation(id);
    }
}