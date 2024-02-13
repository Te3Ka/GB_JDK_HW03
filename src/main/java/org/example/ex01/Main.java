package org.example.ex01;

//TIP Написать класс Калькулятор (необобщенный),
// который содержит обобщенные статические методы:
// sum(), multiply(), divide(), subtract().
// Параметры этих методов – два числа разного типа,
// над которыми должна быть произведена операция.

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Сумма");
        System.out.println(calculator.sum(2.987654321, 5.123456789)); // double
        System.out.println(calculator.sum(2, 5.123456789)); // int
        System.out.println(calculator.sum(2, 5)); // int
        System.out.println(calculator.sum(4_123_456_789L, 5_987_654_321L)); // long

        System.out.println("Разность");
        System.out.println(calculator.diff(2.987654321, 5.123456789));
        System.out.println(calculator.diff(5.123456789, 2.987654321));
        System.out.println(calculator.diff(2, 5));
        System.out.println(calculator.diff(5, 2));
        System.out.println(calculator.diff(4_123_456_789L, 5_987_654_321L));
        System.out.println(calculator.diff(5_987_654_321L, 4_123_456_789L));

        System.out.println("Умножение");
        System.out.println(calculator.mult(2.987654321, 5.123456789));
        System.out.println(calculator.mult(2, 5));
        System.out.println(calculator.mult(4_123_456_789L, 5_987_654_321L)); // Выходит за диапазон Long

        System.out.println("Деление");
        System.out.println(calculator.div(2.987654321, 5.123456789));
        System.out.println(calculator.div(5.123456789, 2.987654321));
        System.out.println(calculator.div(2, 5));
        System.out.println(calculator.div(5, 2));
        System.out.println(calculator.div(10, 2));
        System.out.println(calculator.div(4_123_456_789L, 5_987_654_321L));
        System.out.println(calculator.div(5_987_654_321L, 4_123_456_789L));
        System.out.println(calculator.div(10, 0));
    }
}