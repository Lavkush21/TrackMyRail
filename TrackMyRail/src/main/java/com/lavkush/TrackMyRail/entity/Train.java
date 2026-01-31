package com.lavkush.TrackMyRail.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Train {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trainName;

    private String trainNumber;


    @OneToMany(mappedBy = "train", cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
    private List<TrainSchedule> scheduleList;

    public Long getId() {
        return id;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public List<TrainSchedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(List<TrainSchedule> scheduleList) {
        this.scheduleList = scheduleList;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public  Train() {

    }

}
