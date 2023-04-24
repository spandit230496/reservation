package com.irctc.reservation.controller;

import com.irctc.reservation.service.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodOrderController {

    @Autowired
    FoodOrderService foodOrderService;
}
