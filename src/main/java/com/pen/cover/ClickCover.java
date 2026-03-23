package com.pen.cover;

public class ClickCover implements Cover {

    @Override
    public void start() {
        System.out.println("Button pressed, nib extended.");
    }

    @Override
    public void close() {
        System.out.println("Button pressed, nib retracted.");
    }
}
