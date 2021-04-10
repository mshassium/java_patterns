package ru.mshassium.java_patterns.adapter.model;

public class Worker {

    public String work(SimpleJsonObject jsonObject){
        return jsonObject.getResult();
    }

}
