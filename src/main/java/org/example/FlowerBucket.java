package org.example;

import java.util.ArrayList;

/**
 * bucket of flowers
 */

public class FlowerBucket {

    /**
     * initialize bucket of flowers
     */
    private static final ArrayList<FlowerPack> bucket = new ArrayList<>();

    /**
     * add flowers
     */
    public void add(FlowerPack flowerPack){
        bucket.add(flowerPack);
    }

    /**
     * get price of flower
     */
    public int getPrice(){
        int sum = 0;
        for (FlowerPack flowerPack: bucket){
            sum += flowerPack.getPrice();
        }
        return sum;
    }
}
