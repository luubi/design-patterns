package com.vlt.singleton;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        EagerInitializedSingleton singleton1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton singleton2 = EagerInitializedSingleton.getInstance();
        if (singleton1.equals(singleton2)) {
            System.out.println("2 object là 1");
        }
        else {
            System.out.println("2 object khác nhau");
        }
    }
}
