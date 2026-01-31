package com.lavkush.TrackMyRail.controller;

import com.lavkush.TrackMyRail.entity.Station;
import com.lavkush.TrackMyRail.entity.Train;
import com.lavkush.TrackMyRail.entity.TrainSchedule;
import com.lavkush.TrackMyRail.repo.StationRepository;
import com.lavkush.TrackMyRail.repo.TrainRepository;
import com.lavkush.TrackMyRail.repo.TrainScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class Test {

    @Autowired
    StationRepository stationRepository;

    @Autowired
    TrainRepository trainRepository;

    @Autowired
    TrainScheduleRepository trainScheduleRepository;

    @GetMapping
    public void test() {

        Station delhi = new Station(null, "New Delhi", "NDLS");
        Station mumbai = new Station(null, "Mumbai Central", "BCT");
        Station kolkata = new Station(null, "Kolkata", "KOAA");
        Station chennai = new Station(null, "Chennai Central", "MAS");

        stationRepository.saveAll(List.of(delhi, mumbai, kolkata, chennai));

        Train rajdhani = new Train(null, "Rajdhani Express", "1224", null);
        Train durunto = new Train(null, "Durunto Express", "19806", null);
        Train shatabdi = new Train(null, "Shatabdi Express", "120342", null);

        trainRepository.saveAll(List.of(rajdhani, durunto, shatabdi));

        TrainSchedule scl = new TrainSchedule(null, rajdhani, delhi, mumbai, "06:00", "14:00");
        TrainSchedule scl2 = new TrainSchedule(null, durunto, delhi, mumbai, "05:00", "19:00");
        TrainSchedule scl3 = new TrainSchedule(null, shatabdi, delhi, chennai, "02:00", "12:00");

        trainScheduleRepository.saveAll(List.of(scl, scl2, scl3));

        System.out.println("Data inserted in database");
    }
}