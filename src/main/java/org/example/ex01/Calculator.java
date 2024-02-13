package org.example.ex01;

import java.io.IOException;

public class Calculator {
    public static <T extends Number> T sum(T t1, T t2) {
        if (t1 instanceof Integer || t2 instanceof Integer) {
            return (T) Integer.valueOf(t1.intValue() + t2.intValue());
        }
        if (t1 instanceof Double || t2 instanceof Double) {
            return (T) Double.valueOf(t1.doubleValue() + t2.doubleValue());
        }
        if (t1 instanceof Long || t2 instanceof Long) {
            return (T) Long.valueOf(t1.longValue() + t2.longValue());
        }
        return null;
    }

    public static <T extends Number> T diff(T t1, T t2) {
        if (t1 instanceof Integer || t2 instanceof Integer) {
            return (T) Integer.valueOf(t1.intValue() - t2.intValue());
        }
        if (t1 instanceof Double || t2 instanceof Double) {
            return (T) Double.valueOf(t1.doubleValue() - t2.doubleValue());
        }
        if (t1 instanceof Long || t2 instanceof Long) {
            return (T) Long.valueOf(t1.longValue() - t2.longValue());
        }
        return null;
    }

    public static <T extends Number> T mult(T t1, T t2) {
        if (t1 instanceof Integer || t2 instanceof Integer) {
            return (T) Integer.valueOf(t1.intValue() * t2.intValue());
        }
        if (t1 instanceof Double || t2 instanceof Double) {
            return (T) Double.valueOf(t1.doubleValue() * t2.doubleValue());
        }
        if (t1 instanceof Long || t2 instanceof Long) {
            return (T) Long.valueOf(t1.longValue() * t2.longValue());
        }
        return null;
    }

    public static <T extends Number> T div(T t1, T t2) {
        if (t2.doubleValue() == 0) {
            throw new ArithmeticException("Деление на 0");
        }
        if (t1 instanceof Integer || t2 instanceof Integer) {
            return (T) Double.valueOf(t1.doubleValue() / t2.doubleValue());
        }
        if (t1 instanceof Double || t2 instanceof Double) {
            return (T) Double.valueOf(t1.doubleValue() / t2.doubleValue());
        }
        if (t1 instanceof Long || t2 instanceof Long) {
            return (T) Double.valueOf(t1.doubleValue() / t2.doubleValue());
        }
        return null;
    }
}
