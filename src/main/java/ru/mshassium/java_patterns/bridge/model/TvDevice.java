package ru.mshassium.java_patterns.bridge.model;

public class TvDevice extends DefaultDevice {

    @Override
    public void nextChannel() {
        channel++;
    }

    @Override
    public void prevChannel() {
        channel--;
    }
}
