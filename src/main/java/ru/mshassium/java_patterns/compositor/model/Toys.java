package ru.mshassium.java_patterns.compositor.model;

/**
 * @author <a href="mailto:khamitov-rail@yandex-team.ru">Rail Khamitov</a>
 * @date 08.04.2021
 */
public class Toys implements Entity{

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public void addChild(Entity child) {
        System.out.println("You cannot add Child to concrete Entity");
    }

    @Override
    public void removeChild(Entity child) {
        System.out.println("You cannot remove Child to concrete Entity");
    }
}
