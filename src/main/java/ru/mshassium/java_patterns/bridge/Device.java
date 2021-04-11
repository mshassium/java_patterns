package ru.mshassium.java_patterns.bridge;

public interface Device {

    boolean isEnable();
    void nextChannel();
    void prevChannel();
    void addVolume();
    void remVolume();

}
