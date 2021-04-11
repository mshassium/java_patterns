package ru.mshassium.java_patterns.bridge;

public class Client {

    public static void main(String[] args) {
        TvDevice tv = new TvDevice();
        Remote remote = new Remote(tv);
        remote.addVolume(10);
        AdditionalRemote additionalRemote = new AdditionalRemote(tv);
        additionalRemote.mute();
    }

}
