package ru.mshassium.java_patterns.adapter.model;

public class SimpleXMLObject {

    private final String xmlValue;

    public SimpleXMLObject(String xmlValue) {
        this.xmlValue = xmlValue;
    }

    public String getXmlValue(){
        return xmlValue;
    }

}
