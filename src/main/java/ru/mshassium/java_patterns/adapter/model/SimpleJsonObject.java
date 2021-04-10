package ru.mshassium.java_patterns.adapter.model;

import java.security.PublicKey;

public class SimpleJsonObject {

    private String result;

    public SimpleJsonObject(){};

    public SimpleJsonObject(String result) {
        this.result = result;
    }

    public String getResult(){
        return result;
    }

}
