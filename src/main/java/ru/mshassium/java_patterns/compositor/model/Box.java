package ru.mshassium.java_patterns.compositor.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:khamitov-rail@yandex-team.ru">Rail Khamitov</a>
 * @date 08.04.2021
 */
public class Box implements Entity {

    private final List<Entity> childList = new ArrayList<>();

    @Override
    public void addChild(Entity child) {
        childList.add(child);
    }

    @Override
    public void removeChild(Entity child) {
        childList.remove(child);
    }

    @Override
    public int getPrice() {
        return childList.stream().parallel()
                .map(Entity::getPrice)
                .reduce(0, Integer::sum);
    }

}
