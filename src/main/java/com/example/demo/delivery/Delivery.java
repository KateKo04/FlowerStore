package com.example.demo.delivery;


import com.example.demo.Item;

import java.util.ArrayList;

public class Delivery {
    public static void deliver(ArrayList<Item> items){
        System.out.println("Currently delivering: ");
        for (int i=0; i<items.size(); i++)
            System.out.println(items.get(i) + " ");
    }
}
