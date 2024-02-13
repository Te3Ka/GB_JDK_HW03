package org.example.ex02;

/*
Напишите обобщенный метод compareArrays(),
который принимает два массива и возвращает true,
если они одинаковые, и false в противном случае.
Массивы могут быть любого типа данных,
но должны иметь одинаковую длину и содержать элементы одного типа.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Number[] numbers = new Number[5];
        Integer[] integers = new Integer[5];
        String[] strings = new String[5];

        Fruit[] fruits = new Fruit[4];
        Apple[] apples = new Apple[4];
        Orange[] oranges = new Orange[4];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i * 2;
        }
        for (int i = 0; i < strings.length; i++) {
            strings[i] = String.valueOf(i * 2);
        }


        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new Fruit(1, 2);
        }

        for (int i = 0; i < apples.length; i++) {
            apples[i] = new Apple(1, 2);
        }

        for (int i = 0; i < oranges.length; i++) {
            oranges[i] = new Orange(2, 3);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(integers));
        System.out.println("Numbers and Integers = " + CompareArrays.compareArrays(numbers, integers)); // true
        System.out.println("Numbers and Strings = " + CompareArrays.compareArrays(numbers, strings)); // false

        System.out.println("Apples and Fruits = " + CompareArrays.compareArrays(apples, fruits)); // true
        System.out.println("Oranges and Fruits = " + CompareArrays.compareArrays(oranges, fruits)); // true
        System.out.println("Apples and Oranges = " + CompareArrays.compareArrays(apples, oranges)); // false
    }
}
