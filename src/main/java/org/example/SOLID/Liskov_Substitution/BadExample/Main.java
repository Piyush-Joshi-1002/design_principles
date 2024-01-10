package org.example.SOLID.Liskov_Substitution.BadExample;

import org.jetbrains.annotations.NotNull;

import static org.junit.Assert.assertEquals;

public class Main {
    /*
     * Definition :We should be substituted base class object with child class,
     *  and it should not alter behavior/Characteristics of program.
     *
    */
    public static void main(String [] args) {
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println(rectangle.CalcuateArea());
        System.out.println(System.getProperty("user.name"));
        Square square = new Square(30);
        System.out.println(square.CalcuateArea());
        useRectangle(rectangle);
        useRectangle(square);
    }
    public static void useRectangle(Rectangle rectangle){
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        assert rectangle.getWidth() == 30;
        assert rectangle.getHeight() == 20;
    }
}
