package com.pen.writable;

public class BallWritable implements Writable {

    @Override
    public void write(String color, String input) {
        System.out.printf("Ballpoint [%s]: %s%n", color, input);
    }
}
