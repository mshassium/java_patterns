package ru.mshassium.java_patterns.adapter;

import ru.mshassium.java_patterns.adapter.model.SimpleJsonObject;
import ru.mshassium.java_patterns.adapter.model.SimpleXMLObject;
import ru.mshassium.java_patterns.adapter.model.Worker;

public class Client {

    public static void main(String[] args) {

        Worker worker = new Worker();
        SimpleJsonObject json = new SimpleJsonObject("{hello json}");
        SimpleXMLObject xml = new SimpleXMLObject("<hello xml>");
        System.out.println("json value is : "+worker.work(json));
        XmlToJsonAdapter adapter = new XmlToJsonAdapter(xml);
        System.out.println("xml value is : "+worker.work(adapter));
    }

}
