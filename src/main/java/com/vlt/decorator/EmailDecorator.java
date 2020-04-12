package com.vlt.decorator;

public class EmailDecorator implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Email thông báo: " + message);
    }
}
