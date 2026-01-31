package com.lavkush.TrackMyRail.repo;

import com.lavkush.TrackMyRail.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {

}
