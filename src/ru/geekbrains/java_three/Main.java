package ru.geekbrains.java_three;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Integer[] arr_i = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Float[] arr_f = new Float[] {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f};
        System.out.println("Исходные массивы:");
        output(arr_i);
        output(arr_f);
        System.out.println("Измененные массивы:");
        change(arr_i, 3, 7);
        change(arr_f, 8,4);
        System.out.println("Массив в ArrayList:");
        arrayToArrayList(arr_i);
        arrayToArrayList(arr_f);
    }

//    Вывод массива на экран
    public static <T> void output(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//    Меняем местами два элемента массива
    public static <T> void change(T[] arr, int first, int second){
        T tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
        output(arr);
    }

    public static <T> void arrayToArrayList(T[] arr){
        ArrayList<T> tmp = new ArrayList<>();
        Collections.addAll(tmp, arr);
        System.out.println(tmp);
    }
}
