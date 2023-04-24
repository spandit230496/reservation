package com.irctc.reservation.service;

import com.irctc.reservation.entity.Passenger;
import com.irctc.reservation.entity.Train;
import com.irctc.reservation.repository.PassengerRepository;
import com.irctc.reservation.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;
    @Autowired
    TrainRepository trainRepository;



    public void addPassenger(Passenger passenger){

        Train train = trainRepository.findByTrainNumber(passenger.getTrainNumber());
         if(train==null){
             throw new RuntimeException("Train Not Found");
         }

             passenger.setTrainNumber(train.getTrainNumber());
             passenger.setDate(new Date());
             passenger.setTrain(train);


  passengerRepository.save(passenger);
    }
    public List<Passenger> allMale(int age1,int age2){
        List<Passenger>li=passengerRepository.findAll();
        List<Passenger>ans=new ArrayList<>();

        for(Passenger x:li){
            if((x.getAge()>=age1)&&(x.getAge()<=age2)){
                   ans.add(x);
            }

        }

        return  ans;
    }

}
