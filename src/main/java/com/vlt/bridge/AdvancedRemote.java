package com.vlt.bridge;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: tắt tiếng");
        device.setVolume(0);
    }
}
