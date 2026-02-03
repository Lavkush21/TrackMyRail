package com.lavkush.TrackMyRail.controller;

import com.lavkush.TrackMyRail.entity.Station;
import com.lavkush.TrackMyRail.service.StationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stations")
@CrossOrigin(origins = "http://localhost:3000")
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
    public ResponseEntity<Station> addStation(@RequestBody Station station) {
        Station savedStation = stationService.addStation(station);
        return ResponseEntity.ok(savedStation);
    }

    @GetMapping("/{id}")
    public Station getStationById(@PathVariable Long id) {
        return stationService.getStationById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStation(@PathVariable Long id) {
        stationService.deleteStation(id);
        return ResponseEntity.ok().build();
    }
}