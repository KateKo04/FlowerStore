package org.example;

import java.util.ArrayList;

public class Store {

    ArrayList<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower){
        flowers.add(flower);
    }

    public String search(Flower flower){

        int counter = 0;

        for (int i = 0; i<flowers.size(); i++){
            Flower flowerCurrent = flowers.get(i);
            if (flower.getClass() != flowerCurrent.getClass() ||
                flower.getPrice() != flowerCurrent.getPrice() ||
                flower.getColor() != flowerCurrent.getColor() ||
                flower.getSepalLength() != flowerCurrent.getSepalLength())
                continue;
            else
                counter++;
        }
        return "There are " + counter + " " + flower.getClass().getSimpleName() + "s";
    }

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
