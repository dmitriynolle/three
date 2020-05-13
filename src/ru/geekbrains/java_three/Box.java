package ru.geekbrains.java_three;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitBox;

    public Box(){
        fruitBox = new ArrayList<>();
    }

    public void addFruit(T fruit){
        fruitBox.add(fruit);
    }

    public void printBox(){
        for (int i = 0; i < fruitBox.size(); i++) {
           T tmp = fruitBox.get(i);
            System.out.println(tmp.name);
        }
    }

    public Float getWeight(){
        float tmp = 0;
        if (fruitBox.size() != 0)
            tmp = fruitBox.size() * fruitBox.get(0).weight;
        return tmp;
    }

    public boolean compare(Box box){
        return this.getWeight().equals(box.getWeight());
    }

    public void sorting(Box box){
        if (this.fruitBox.get(0) instanceof Apple && box.fruitBox.get(0) instanceof Apple ||
                this.fruitBox.get(0) instanceof Orange && box.fruitBox.get(0) instanceof Orange){
            for (int i = 0; i < this.fruitBox.size(); i++) {
                box.addFruit(this.fruitBox.get(i));
            }
            this.fruitBox.clear();
        }
        else
            System.out.println("Коробки содержат разные фрукты");
    }
}
