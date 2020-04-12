package com.vlt.decorator;

public class SlackDecorator extends BaseDecorator {

    SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Slack thông báo: " + message);
    }
}
