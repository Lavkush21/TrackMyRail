package com.lavkush.TrackMyRail.entity;


import jakarta.persistence.*;

@Entity
public class TrainSchedule {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private  Long id;

    @ManyToOne
    @JoinColumn(name = "train_id")
    private Train train;



    @ManyToOne
    @JoinColumn(name = "source_id")
    private  Station source;


    @ManyToOne
    @JoinColumn(name = "destination_id")
    private  Station destination;




    private String departureTime;

    private String arrivalTime;


    public TrainSchedule() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Train getTrain() {
        return train;
    }

    public Station getSource() {
        return source;
    }

    public void setSource(Station source) {
        this.source = source;
    }

    public void setTrain(Train train) {
        this.train = train;
    }



    public Station getDestination() {
        return destination;
    }

    public void setDestination(Station destination) {
        this.destination = destination;
    }


}
