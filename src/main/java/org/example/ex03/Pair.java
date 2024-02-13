package org.example.ex03;

public class Pair<E1, E2> {
    private E1 e1;
    private E2 e2;

    public Pair(E1 e1, E2 e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    private E1 getE1() {
        return e1;
    }

    private E2 getE2() {
        return e2;
    }

    public static <E1, E2> E1 getFirst(E1 e1, E2 e2) {
        return e1;
    }

    public static <E1, E2> E2 getSecond(E1 e1, E2 e2) {
        return e2;
    }

    public static <E1, E2> String  toString(E1 e1, E2 e2) {
        return "Pair{ " + e1.toString() + "; " + e2.toString() + " }";
    }

    public String toString() {
        return "[ " + getE1().toString() + "; " + getE2().toString() + " ]";
    }


    public E1 getFirst() {
        return getE1();
    }

    public E2 getSecond() {
        return getE2();
    }
}
