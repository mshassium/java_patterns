package ru.mshassium.java_patterns.bridge.model;

public interface Device {

    boolean isEnable();
    void nextChannel();
    void prevChannel();
    void addVolume();
    void remVolume();

}
