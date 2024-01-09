package org.example.DecoratorDesignPattern;

import org.example.DecoratorDesignPattern.BasePizza.BasePizza;
import org.example.DecoratorDesignPattern.BasePizza.FarmHouse;
import org.example.DecoratorDesignPattern.BasePizza.Marghereta;
import org.example.DecoratorDesignPattern.BasePizza.VegDelight;
import org.example.DecoratorDesignPattern.Toppings.ExtraCheese;
import org.example.DecoratorDesignPattern.Toppings.Mushroom;

import java.util.ArrayList;

public class Orders {
    public static void main(String[] args) {
        ArrayList<BasePizza> orders = new ArrayList<>();
        orders.add( new Mushroom(new ExtraCheese(new VegDelight())));
        orders.add(new Mushroom(new ExtraCheese(new Marghereta())));
        orders.add(new ExtraCheese(new ExtraCheese(new Marghereta())));
        orders.add(new Mushroom(new Mushroom(new FarmHouse())));
        orders.add(new ExtraCheese(new Mushroom(new ExtraCheese(new VegDelight()))));
        orders.add(new Mushroom(new ExtraCheese(new Mushroom(new FarmHouse()))));

        int i = 1;
        for(BasePizza order : orders){
            System.out.println("Cost for the "+  i + "th order is " + order.cost());
            i++;
        }

    }
}
