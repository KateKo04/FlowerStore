package org.example;

import java.util.ArrayList;

public class FlowerPack {

    private static ArrayList<Flower> flowerPack;
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount){
        this.flower = flower;
        flowerPack.add(flower);
        this.amount = amount;
    }

    public int getPrice(){
        int sum = 0;
        for (Flower fl: flowerPack){
            sum += fl.getPrice();
        }
        return sum;
    }
}
