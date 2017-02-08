package OCJP8.chap7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yevgeniya.zuyeva on 08.02.2017.
 */
//deadlock
public class Fox {

    String name;

    public Fox(String name) {
        this.name = name;
    }

    public void eatAndDrink(Food food, Water water) {
        synchronized (food) {
            System.out.println(name + ":Got Food!");
            move();
            synchronized (water) {
                System.out.println(name + ":Got Water!");
            }

        }
    }

    public void drinkAndEat(Water water, Food food) {
        synchronized (water) {
            System.out.println(name + ":Got water!");
            move();
            synchronized (food) {
                System.out.println(name + ":Got food!");
            }
        }
    }

    public void move() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Fox foxy = new Fox("Foxy");
        Fox tails = new Fox("Tails");

        Food food = new Food();
        Water water = new Water();

        ExecutorService service = null;

        try {
            service = Executors.newScheduledThreadPool(10);
            service.submit(()->foxy.eatAndDrink(food,water));
            service.submit(()->tails.drinkAndEat(water,food));
        } finally {
            if (service != null) service.shutdown();
        }

    }

}

class Water {
}

class Food {
}
