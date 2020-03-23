package com.vlt.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();
        if (singleton1.equals(singleton2)) {
            System.out.println("2 object là 1");
        }
        else {
            System.out.println("2 object khác nhau");
        }
    }

    //static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        }
        catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
}
