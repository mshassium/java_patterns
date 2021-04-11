package ru.mshassium.java_patterns.bridge.model;

public class Radio extends DefaultDevice {

    @Override
    public void nextChannel() {
        channel += 10;
    }

    @Override
    public void prevChannel() {
        channel -= 10;
    }
}
