package org.example.ex02;

public class CompareArrays {
    public static <T> boolean compareArrays(T[] arrayOne, T[] arrayTwo) {
        if (arrayOne.length != arrayTwo.length) {
            return false;
        }
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println("arrayOne[" + i + "].getClass() = " + arrayOne[i].getClass());
            System.out.println("arrayTwo[" + i + "].getClass() = " + arrayTwo[i].getClass());
            if (!arrayTwo[i].getClass().isInstance(arrayOne[i])) {
                return false;
            }
        }
        return true;
    }
}
