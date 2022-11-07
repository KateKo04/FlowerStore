package com.example.demo.flower;

import java.util.ArrayList;

/**
 * store of flowers
 */

public class Store {

    /**
     * initialize store with flowers
     */
    ArrayList<Flower> flowers = new ArrayList <>();

    /**
     * add flowers
     */
    public void addFlower(Flower flower){
        flowers.add(flower);
    }

    /**
     * search of flowers
     */
    public String search(Flower flower){

        int counter = 0;

        for (int i = 0; i<flowers.size(); i++){
            Flower flowerCurrent = flowers.get(i);
            if (flower.getClass() != flowerCurrent.getClass() ||
                flower.getPrice() != flowerCurrent.getPrice() ||
                flower.getColor() != flowerCurrent.getColor() ||
                flower.getSepalLength() != flowerCurrent.getSepalLength()){
                continue;
            }
            else
                counter++;
        }
        return "There are " + counter + " " + flower.getClass().getSimpleName() + "s";
    }

    /**
     * just test store of flowers
     */
    public static void main(String[] args) {
        Store store = new Store();
        store.addFlower(new Rose());
        store.addFlower(new Rose());
        store.addFlower(new Tulp());
        store.addFlower(new Tulp());

        System.out.println(store.search(new Rose()));
        System.out.println(store.search(new Tulp()));
        System.out.println(store.search(new Chamomile()));
    }
}
