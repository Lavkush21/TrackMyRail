package com.lavkush.TrackMyRail.repo;

import com.lavkush.TrackMyRail.entity.TrainSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StationRepository  extends JpaRepository<TrainSchedule, Long> {
}
