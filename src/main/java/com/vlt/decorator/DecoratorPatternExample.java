package com.vlt.decorator;

public class DecoratorPatternExample {

    public static void main(String[] args) {
        boolean enableFacebookNotifier = true;
        boolean enableSlackNotifier = true;
        boolean enableSMSNotifier = false;

        Notifier notifier = new EmailDecorator();
        if (enableFacebookNotifier) {
            notifier = new FacebookDecorator(notifier);
        }
        if (enableSlackNotifier) {
            notifier = new SlackDecorator(notifier);
        }
        if (enableSMSNotifier) {
            notifier = new SmsDecorator(notifier);
        }

        notifier.send("Hệ thống hết ổ cứng!!! Yêu cầu lắp thêm ổ cứng");
    }
}
