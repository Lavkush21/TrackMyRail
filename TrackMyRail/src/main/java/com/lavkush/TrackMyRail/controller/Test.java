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

        // Pehle purana data delete karo
        trainScheduleRepository.deleteAll();
        trainRepository.deleteAll();
        stationRepository.deleteAll();

        // Stations
        Station delhi = new Station(null, "New Delhi", "NDLS");
        Station mumbai = new Station(null, "Mumbai Central", "BCT");
        Station kolkata = new Station(null, "Kolkata", "KOAA");
        Station chennai = new Station(null, "Chennai Central", "MAS");
        Station bangalore = new Station(null, "Bangalore", "BNGR");
        Station karnatka = new Station(null, "Karnataka", "KRNK");
        Station jujrat = new Station(null, "Jujrat", "JUJR");
        Station varanasi = new Station(null, "Varanasi", "BNS");
        Station allahabad = new Station(null, "Allahabad", "ALD");

        stationRepository.saveAll(List.of(delhi, mumbai, kolkata, chennai, bangalore, karnatka, jujrat, varanasi, allahabad));

        // Trains
        Train rajdhani = new Train(null, "Rajdhani Express", "1224", null);
        Train durunto = new Train(null, "Durunto Express", "19806", null);
        Train shatabdi = new Train(null, "Shatabdi Express", "120342", null);
        Train karnatkaExp = new Train(null, "Karnataka Express", "12247", null);
        Train bangaloreExp = new Train(null, "Bangalore Express", "12658", null);
        Train jujratExp = new Train(null, "Jujrat Express", "11011", null);
        Train varanasiExp = new Train(null, "Varanasi Express", "13131", null);
        Train allahabadExp = new Train(null, "Allahabad Express", "15054", null);

        trainRepository.saveAll(List.of(rajdhani, durunto, shatabdi, karnatkaExp, bangaloreExp, jujratExp, varanasiExp, allahabadExp));

        // Schedules
        TrainSchedule scl = new TrainSchedule(null, rajdhani, delhi, mumbai, "06:00", "14:00");
        TrainSchedule scl2 = new TrainSchedule(null, durunto, delhi, mumbai, "05:00", "19:00");
        TrainSchedule scl3 = new TrainSchedule(null, shatabdi, delhi, chennai, "02:00", "12:00");
        TrainSchedule scl4 = new TrainSchedule(null, karnatkaExp, delhi, karnatka, "08:00", "22:00");
        TrainSchedule scl5 = new TrainSchedule(null, bangaloreExp, delhi, bangalore, "09:30", "23:30");
        TrainSchedule scl6 = new TrainSchedule(null, jujratExp, delhi, jujrat, "07:00", "18:00");
        TrainSchedule scl7 = new TrainSchedule(null, varanasiExp, delhi, varanasi, "10:00", "20:00");
        TrainSchedule scl8 = new TrainSchedule(null, allahabadExp, delhi, allahabad, "11:00", "19:30");

        trainScheduleRepository.saveAll(List.of(scl, scl2, scl3, scl4, scl5, scl6, scl7, scl8));

        System.out.println("Data inserted in database");
    }
}