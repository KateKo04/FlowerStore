package com.example.demo;


import com.example.demo.flower.Flower;
import com.example.demo.flower.FlowerColor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowerTest {
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testPrice() {
        int price = 20;
        flower.setPrice(price);
        assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(String.valueOf(color));
        assertEquals("#FF0000", flower.getColor().toString());
    }
}