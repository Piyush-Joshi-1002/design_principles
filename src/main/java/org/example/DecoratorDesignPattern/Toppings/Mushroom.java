package org.example.DecoratorDesignPattern.Toppings;

import org.example.DecoratorDesignPattern.BasePizza.BasePizza;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza ;
    int MushroomCost  = 50;
    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+MushroomCost;
    }
}
