package ru.mshassium.java_patterns.bridge;

public class Remote {

    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void addVolume(int count) {
        for (int i = 0; i < count; i++) {
            device.addVolume();
        }
    }

    public boolean isEnable() {
        return device.isEnable();
    }
}
