package com.irctc.reservation.service;

import com.irctc.reservation.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodOrderService {

    @Autowired
    FoodRepository foodRepository;
}
