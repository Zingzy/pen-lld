package com.pen.writable;

public class GelWritable implements Writable {

    @Override
    public void write(String color, String input) {
        System.out.printf("Gel pen [%s]: %s%n", color, input);
    }
}
