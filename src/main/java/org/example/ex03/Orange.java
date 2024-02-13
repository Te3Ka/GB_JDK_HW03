package org.example.ex03;

public class Orange extends Fruit {
    public Orange(int coast, int weight) {
        super(coast, weight);
    }

    @Override
    public String toString() {
        return "Orange{" + super.coast + ", " + super.weight + "}";
    }
}
