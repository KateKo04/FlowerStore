package org.example;

import java.util.ArrayList;

public class FlowerBucket {
    private static ArrayList<FlowerPack> bucket = new ArrayList<>();

    public void add(FlowerPack flowerPack){
        bucket.add(flowerPack);
    }

    public int getPrice(){
        int sum = 0;
        for (FlowerPack flowerPack: bucket){
            sum += flowerPack.getPrice();
        }
        return sum;
    }
}
