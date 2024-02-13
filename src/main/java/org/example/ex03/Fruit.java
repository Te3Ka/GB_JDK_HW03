package org.example.ex03;

public class Fruit {
    int coast;
    int weight;

    public Fruit(int coast, int weight) {
        this.coast = coast;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" + coast + ", " + weight + "}";
    }
}
