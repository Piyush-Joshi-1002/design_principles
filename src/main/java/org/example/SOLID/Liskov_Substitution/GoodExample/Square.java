package org.example.SOLID.Liskov_Substitution.GoodExample;

public class Square implements Shape {

    private int side;
    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public Square(int side) {
        this.side= side;
    }

    @Override
    public int CalculateArea() {
        synchronized (this) {
            return side * side;
        }
    }
}
