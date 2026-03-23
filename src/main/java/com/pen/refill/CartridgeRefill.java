package com.pen.refill;

public class CartridgeRefill implements Refill {

    @Override
    public void refill(String color) {
        System.out.printf("Old cartridge removed. New %s cartridge inserted.%n", color);
    }
}
