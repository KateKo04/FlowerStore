package com.example.demo.flower;

import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Flower {

    /**
     * Take length of flower's sepal
     */
    private double sepalLength;

    /**
     * Take color of flower
     */
    private FlowerColor color;

    /**
     * Take price of flower
     */
    private double price;

}

