package ru.mshassium.java_patterns.bridge.model;

public class AdditionalRemote extends Remote {

    public AdditionalRemote(Device device) {
        super(device);
    }

    public void mute() {
        for (int i = 0; i < 100; i++) {
            device.remVolume();
        }
    }
}
