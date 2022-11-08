package com.example.demo.flower;

import com.example.demo.Item;

public class FlowerDiscount extends Item{
    private Item item;

    public FlowerDiscount(Item item){
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice()*0.2;
    }
}
