package ru.mshassium.java_patterns.compositor.model;

/**
 * @author <a href="mailto:khamitov-rail@yandex-team.ru">Rail Khamitov</a>
 * @date 08.04.2021
 */
public interface Entity {

    int getPrice();

    void addChild(Entity child);

    void removeChild(Entity child);

}
