package com.vlt.flyweight;

public class Circle {

    CircleType type;
    int x;
    int y;
    int radius;

    public Circle(CircleType type, int x, int y, int radius) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        System.out.printf("Vẽ hình tròn màu %s tại vị trí X:%d-Y:%d với bán kính %d \n", type.color, x, y, radius);
    }
}
