package com.lavkush.TrackMyRail.repo;

import com.lavkush.TrackMyRail.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrainScheduleRepository extends JpaRepository<Station, Long>
{
}
