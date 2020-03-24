package com.vlt.bridge;

public class BridgePatternDemo {

    public static void main(String[] args) {
        System.out.println("Thử với Tivi");
        testDevice(new Tivi());
        System.out.println("Thử với Radio");
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Thử với basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Thử với advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
