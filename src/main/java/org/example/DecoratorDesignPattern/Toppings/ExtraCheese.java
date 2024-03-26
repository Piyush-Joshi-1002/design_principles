package org.example.DecoratorDesignPattern.Toppings;

import org.example.DecoratorDesignPattern.BasePizza.BasePizza;

public class ExtraCheese extends ToppingDecorator {
    /*
    *  (Child) cheese  - > base class
    *  (Child) mushroom ->base class
    *  Base_Pizza -> farmHouse, Margherta, VegDelight
    *
    *  Base b1 = new Child();
    *  b1  =new  cheese(new mushroom(new farmHouse()))
    *
    * */
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
