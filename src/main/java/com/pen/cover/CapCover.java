package com.pen.cover;

public class CapCover implements Cover {

    @Override
    public void start() {
        System.out.println("Cap off.");
    }

    @Override
    public void close() {
        System.out.println("Cap back on.");
    }
}
