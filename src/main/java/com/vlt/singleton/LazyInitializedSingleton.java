package com.vlt.singleton;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazyInitializedSingleton singleton1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton singleton2 = LazyInitializedSingleton.getInstance();
        if (singleton1.equals(singleton2)) {
            System.out.println("2 object là 1");
        }
        else {
            System.out.println("2 object khác nhau");
        }
    }
}
