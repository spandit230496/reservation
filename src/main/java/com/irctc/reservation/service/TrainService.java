package com.irctc.reservation.service;

import com.irctc.reservation.entity.Passenger;
import com.irctc.reservation.entity.Train;
import com.irctc.reservation.repository.PassengerRepository;
import com.irctc.reservation.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainService {

    @Autowired
    TrainRepository trainRepository;

    @Autowired
    PassengerRepository passengerRepository;
    public void addTrain(Train train){
        trainRepository.save(train);

    }

    public List<Passenger> getTrain(){
        return passengerRepository.findAll();
    }

}
