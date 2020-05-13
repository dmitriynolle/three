package ru.geekbrains.java_three;

public class MainBox {

    public static void main (String[] args){
        Box<Apple> b1 = new Box<>();
        b1.addFruit(new Apple());
        b1.addFruit(new Apple());
        b1.addFruit(new Apple());

        Box<Orange> b2 = new Box<>();
        b2.addFruit(new Orange());
        b2.addFruit(new Orange());
        b2.addFruit(new Orange());
        b2.addFruit(new Orange());

        Box<Apple> b3 = new Box<>();
        b3.addFruit(new Apple());
        b3.addFruit(new Apple());
        b3.addFruit(new Apple());

        System.out.println("Вес коробки 1: " + b1.getWeight());
        System.out.println("Вес коробки 2: " + b2.getWeight());
        System.out.println("Вес коробки 3: " + b3.getWeight());

        System.out.println(b1.compare(b2));

        b1.sorting(b3);

        System.out.println("Вес коробки 1: " + b1.getWeight());
        System.out.println("Вес коробки 3: " + b3.getWeight());

        System.out.println(b3.compare(b2));
    }
}
