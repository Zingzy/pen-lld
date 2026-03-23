package com.pen.refill;

public class PlasticPipeRefill implements Refill {

    @Override
    public void refill(String color) {
        System.out.printf("Refilling plastic tube with %s ink.%n", color);
    }
}
