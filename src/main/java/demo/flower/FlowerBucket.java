package demo.flower;


import demo.delivery.Item;

import java.util.ArrayList;

/**
 * bucket of flowers
 */

public class FlowerBucket extends Item {

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
    public double getPrice(){
        int sum = 0;
        for (FlowerPack flowerPack: bucket){
            sum += flowerPack.getPrice();
        }
        return sum;
    }
}
