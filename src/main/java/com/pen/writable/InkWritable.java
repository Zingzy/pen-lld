package com.pen.writable;

public class InkWritable implements Writable {

    @Override
    public void write(String color, String input) {
        System.out.printf("Fountain ink [%s]: %s%n", color, input);
    }
}
