package com.vlt.bridge;

public class BasicRemote implements Remote {

    protected Device device;

    public BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote: bật/tắt nguồn");
        if (device.isEnabled()) {
            device.disable();
        }
        else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: giảm volume");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: tăng volume");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote: giảm kênh");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote: tăng kênh");
        device.setChannel(device.getChannel() + 1);
    }
}
