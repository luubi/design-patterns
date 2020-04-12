package com.vlt.decorator;

public class FacebookDecorator extends BaseDecorator {

    FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Facebook thông báo: " + message);
    }
}
