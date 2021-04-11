package ru.mshassium.java_patterns.bridge;

public abstract class DefaultDevice implements Device {

    private boolean enable;
    public int channel;
    private int volume;

    @Override
    public boolean isEnable() {
        return enable;
    }

    @Override
    public void addVolume() {
        volume++;
    }

    @Override
    public void remVolume() {
        volume--;
    }

    @Override
    public abstract void nextChannel();

    @Override
    public abstract void prevChannel();
}
