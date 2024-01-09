package org.example.DecoratorDesignPattern.Toppings;

import org.example.DecoratorDesignPattern.BasePizza.BasePizza;

public class ExtraCheese extends ToppingDecorator {
    BasePizza basePizza ;
    int CheeseCost  = 20;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+CheeseCost;
    }
}
