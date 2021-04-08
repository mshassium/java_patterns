package ru.mshassium.java_patterns.compositor;

import ru.mshassium.java_patterns.compositor.model.Apple;
import ru.mshassium.java_patterns.compositor.model.Box;
import ru.mshassium.java_patterns.compositor.model.Entity;
import ru.mshassium.java_patterns.compositor.model.Hammer;
import ru.mshassium.java_patterns.compositor.model.Toys;
import ru.mshassium.java_patterns.compositor.model.Washer;

/**
 * @author <a href="mailto:khamitov-rail@yandex-team.ru">Rail Khamitov</a>
 * @date 08.04.2021
 */
public class App {

    public static void main(String[] args) {
        Entity boxXXL = new Box();
        Entity appleOne = new Apple();
        Entity boxXl = new Box();
        Entity boxL1 = new Box();
        Entity boxL2 = new Box();
        Entity boxS1 = new Box();
        Entity boxS2 = new Box();
        Entity appleTwo = new Apple();
        Entity hammer = new Hammer();
        Entity toys = new Toys();
        Entity washer = new Washer();
        boxS1.addChild(washer);
        boxXl.addChild(boxS1);
        boxXl.addChild(boxS2);
        boxL1.addChild(appleTwo);
        boxL1.addChild(hammer);
        boxL2.addChild(toys);
        boxXXL.addChild(appleOne);
        boxXXL.addChild(boxXl);
        boxXXL.addChild(boxL1);
        boxXXL.addChild(boxL2);
        int price = boxXXL.getPrice();
        System.out.println(price);
        toys.addChild(appleOne);
        System.out.println(toys.getPrice());
    }

}
