package com.example.demo.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlowerController {

    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }


    @GetMapping(path = "api/v1/flower")
    public List<Flower> getFlowers(){
        return flowerService.getFlowers();
    }

    @GetMapping(path = "api/v1/delivery")
    public String checkDelivery(){
        return "Not delivered yet";
    }

    @GetMapping(path = "api/v1/payment")
    public String checkPayment(){
        return "No payment type chosen";
    }

}
