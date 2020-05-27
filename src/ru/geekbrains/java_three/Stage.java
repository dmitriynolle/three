package ru.geekbrains.java_three;

import java.util.concurrent.Semaphore;

import static ru.geekbrains.java_three.Main.CARS_COUNT;

public abstract class Stage {
    protected int length;
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract void go(Car c);

    protected static Semaphore semaphore = new Semaphore(CARS_COUNT / 2);
}
