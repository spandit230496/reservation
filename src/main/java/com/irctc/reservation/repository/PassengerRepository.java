package com.irctc.reservation.repository;

import com.irctc.reservation.entity.Passenger;
import com.irctc.reservation.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Integer> {


}
