package ru.mshassium.java_patterns.adapter;

import ru.mshassium.java_patterns.adapter.model.SimpleJsonObject;
import ru.mshassium.java_patterns.adapter.model.SimpleXMLObject;

public class XmlToJsonAdapter extends SimpleJsonObject {

    private final SimpleXMLObject xml;

    public XmlToJsonAdapter(SimpleXMLObject xml) {
        this.xml = xml;
    }

    @Override
    public String getResult() {
        return xml.getXmlValue().replace("<", "{").replace(">","}");
    }
}
