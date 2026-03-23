package com.pen.factory;

import com.pen.cover.CapCover;
import com.pen.cover.ClickCover;
import com.pen.cover.Cover;
import com.pen.model.Pen;
import com.pen.refill.CartridgeRefill;
import com.pen.refill.PlasticPipeRefill;
import com.pen.refill.Refill;
import com.pen.writable.BallWritable;
import com.pen.writable.GelWritable;
import com.pen.writable.InkWritable;
import com.pen.writable.Writable;

public class PenFactory {

    public static Pen createPen(String writableType, String coverType, String refillType, String inkColor) {
        Writable writer = resolveWritable(writableType);
        Cover cover = resolveCover(coverType);
        Refill refill = resolveRefill(refillType);
        return new Pen(inkColor, writer, cover, refill);
    }

    private static Writable resolveWritable(String type) {
        return switch (type.toLowerCase()) {
            case "gel" -> new GelWritable();
            case "ink" -> new InkWritable();
            case "ball" -> new BallWritable();
            default -> throw new IllegalArgumentException("Unrecognized writable type: " + type);
        };
    }

    private static Cover resolveCover(String type) {
        return switch (type.toLowerCase()) {
            case "cap" -> new CapCover();
            case "click" -> new ClickCover();
            default -> throw new IllegalArgumentException("Unrecognized cover type: " + type);
        };
    }

    private static Refill resolveRefill(String type) {
        return switch (type.toLowerCase()) {
            case "cartridge" -> new CartridgeRefill();
            case "pipe" -> new PlasticPipeRefill();
            default -> throw new IllegalArgumentException("Unrecognized refill type: " + type);
        };
    }
}
