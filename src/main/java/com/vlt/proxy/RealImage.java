package com.vlt.proxy;

public class RealImage implements Image {

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Display: " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Load " + fileName + " from disk");
    }
}
