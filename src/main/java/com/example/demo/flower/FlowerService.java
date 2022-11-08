package com.example.demo.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class FlowerService {

    @Autowired
    private FlowerRepository flowerRepository;
    public List<Flower> getFlowers(){
        return flowerRepository.findAll();
    }

    public void addFlower(Flower flower){
        flowerRepository.save(flower);
    }
}
