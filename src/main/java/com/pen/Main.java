package com.pen;

import com.pen.factory.PenFactory;
import com.pen.model.Pen;

public class Main {

    public static void main(String[] args) {
        Pen gelPen = PenFactory.createPen("gel", "cap", "cartridge", "Royal Blue");
        Pen clickPen = PenFactory.createPen("ball", "click", "pipe", "Black");

        System.out.println("=== Gel Pen Demo ===");
        gelPen.start();
        gelPen.write("Hello from the gel pen!");
        gelPen.refill("Midnight Black");
        gelPen.write("Writing after a color change.");
        gelPen.close();

        System.out.println();

        System.out.println("=== Click Pen Demo ===");
        clickPen.write("Attempting to write before opening...");
        clickPen.start();
        clickPen.write("Meeting notes: schedule follow-up.");
        clickPen.close();
    }
}
