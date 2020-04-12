package com.vlt.decorator;

public class SmsDecorator extends BaseDecorator {

    SmsDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SMS thông báo: " + message);
    }
}
