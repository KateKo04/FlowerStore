package com.example.demo.flower;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class FlowerService {
    public List<Flower> getFlowers(){
        return List.of(new Rose(), new Chamomile(), new Flower());
    }
}
