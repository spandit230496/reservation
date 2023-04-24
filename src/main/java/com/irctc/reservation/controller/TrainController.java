package com.irctc.reservation.controller;

import com.irctc.reservation.entity.Passenger;
import com.irctc.reservation.entity.Train;
import com.irctc.reservation.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainController {

    @Autowired
    TrainService trainService;

    @PostMapping("/save_train")
    public Train addTrain(@RequestBody Train train){
        trainService.addTrain(train);

        return train;
    }
    @GetMapping("/get_passengers")
    public List<Passenger> getPassenger(){
       return trainService.getTrain();
    }

}
