package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower {

    /**
     * Take length of flower's sepal
     */
    @Getter
    private double sepalLength;

    /**
     * Take color of flower
     */
    @Getter
    private FlowerColor color;

    /**
     * Take price of flower
     */
    @Getter
    private double price;

}

