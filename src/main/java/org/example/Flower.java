package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower {
    @Getter
    private double sepalLength;
    @Getter
    private FlowerColor color;
    @Getter
    private double price;

    private FlowerType flowerType;

}

