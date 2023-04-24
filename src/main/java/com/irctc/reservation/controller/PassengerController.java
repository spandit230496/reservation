package com.irctc.reservation.controller;

import com.irctc.reservation.entity.Passenger;
import com.irctc.reservation.entity.Train;
import com.irctc.reservation.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @PostMapping("/save_passenger")
    public Passenger addTrain(@RequestBody Passenger passenger){
        passengerService.addPassenger(passenger);

        return passenger;
    }
   @GetMapping("/get_all_male")
    public List<Passenger> allMale
           (@RequestParam("lower")int age1,@RequestParam("higher")int age2){
        return passengerService.allMale(age1,age2);
   }
}
