package org.example.DecoratorDesignPattern.BasePizza;

public class FarmHouse implements BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}
