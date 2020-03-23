package com.vlt.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {}

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        BillPughSingleton singleton1 = BillPughSingleton.getInstance();
        BillPughSingleton singleton2 = BillPughSingleton.getInstance();
        if (singleton1.equals(singleton2)) {
            System.out.println("2 object là 1");
        }
        else {
            System.out.println("2 object khác nhau");
        }
    }

    private static class SingletonHelper {

        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
