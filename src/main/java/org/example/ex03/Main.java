package org.example.ex03;

/*
Напишите обобщенный класс Pair,
который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond()
для получения значений каждого из составляющих пары,
а также переопределение метода toString(),
возвращающее строковое представление пары.
 */

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple(1, 2);
        Apple apple2 = new Apple(1, 3);

        Orange orange1 = new Orange(2, 2);
        Orange orange2 = new Orange(2, 3);

        Fruit fruit1 = new Fruit(3, 4);
        Fruit fruit2 = new Fruit(3, 5);

        System.out.println(Pair.getFirst(apple1, orange1).toString());
        System.out.println(Pair.getSecond(fruit1, orange2).toString());
        System.out.println(Pair.toString(apple2, fruit2));

        System.out.println();

        Integer num = 13;
        String str = "Thirteen";
        Pair pair = new Pair(num, str);

        System.out.println(pair.toString());
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
