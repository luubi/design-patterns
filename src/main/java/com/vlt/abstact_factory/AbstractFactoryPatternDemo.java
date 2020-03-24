package com.vlt.abstact_factory;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        //lấy rounded shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        //lấy object kiểu Shape Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        //gọi method draw của Shape Rectangle
        shape1.draw();
        //lấy object kiểu Shape Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        //gọi method draw của Shape Square
        shape2.draw();
        //lấy rounded shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        //lấy object kiểu Shape Rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        //gọi method draw của Shape Rectangle
        shape3.draw();
        //lấy object kiểu Shape Square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        //gọi method draw của Shape Square
        shape4.draw();
    }
}
