package com.irctc.reservation.repository;

import com.irctc.reservation.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<Train,Integer> {

    Train findByTrainNumber(int num);
}
