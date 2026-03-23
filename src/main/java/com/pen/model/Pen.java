package com.pen.model;

import com.pen.cover.Cover;
import com.pen.refill.Refill;
import com.pen.writable.Writable;

public class Pen {

    private String inkColor;
    private boolean isOpen;
    private final Writable writer;
    private final Cover cover;
    private final Refill refill;

    public Pen(String inkColor, Writable writer, Cover cover, Refill refill) {
        this.inkColor = inkColor;
        this.writer = writer;
        this.cover = cover;
        this.refill = refill;
        this.isOpen = false;
    }

    public void write(String input) {
        if (!isOpen) {
            System.out.println("The pen is not open yet. Please open it before writing.");
            return;
        }
        writer.write(inkColor, input);
    }

    public void start() {
        cover.start();
        isOpen = true;
    }

    public void refill(String color) {
        refill.refill(color);
        inkColor = color;
    }

    public void close() {
        cover.close();
        isOpen = false;
    }
}
