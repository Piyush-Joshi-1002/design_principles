package org.example.DecoratorDesignPattern.BasePizza;

import java.util.Base64;

public class Marghereta implements BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}
