package com.vlt.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CircleTypeFactory {

    private static final Map<String, CircleType> circleTypes = new HashMap<>();

    public static CircleType getCircleType(String color) {
        CircleType type = circleTypes.get(color);

        if (type == null) {
            type = new CircleType(color);
            circleTypes.put(color, type);
            System.out.println("Khởi tạo loại vòng tròn màu : " + color);
        }
        return type;
    }
}
