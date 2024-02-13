package org.example.ex03;

public class Apple extends Fruit {
    public Apple(int coast, int weight) {
        super(coast, weight);
    }

    @Override
    public String toString() {
        return "Apple{" + super.coast + ", " + super.weight + "}";
    }

}
