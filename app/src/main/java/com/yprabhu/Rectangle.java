package com.yprabhu;

import java.util.ArrayList;
import java.util.Random;

public class Rectangle {

    private int id;

    public Rectangle(int id) {
        this.id = id;
    }

    public static ArrayList<Rectangle> createListOfRectangles(int numRectangles) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        for (int i = 1; i <= numRectangles; i++) {
            rectangles.add(new Rectangle(i));
        }

        return rectangles;
    }
}
