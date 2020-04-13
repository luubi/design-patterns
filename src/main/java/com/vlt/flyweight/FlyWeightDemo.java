package com.vlt.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyWeightDemo {

    private static Random random = new Random();

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("black");

        for (int i = 0; i < 20; ++i) {
            CircleType type = CircleTypeFactory.getCircleType(colors.get(random(4)));
            Circle circle = new Circle(type, random(100), random(100), random(10));
            circle.draw();
        }
    }

    private static int random(int max) {
        return random.nextInt(max);
    }
}
