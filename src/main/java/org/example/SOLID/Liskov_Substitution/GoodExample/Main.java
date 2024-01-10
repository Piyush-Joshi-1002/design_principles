package org.example.SOLID.Liskov_Substitution.GoodExample;

public class Main {
    /*
     * Definition :We should be substituted base class object with child class,
     *  and it should not alter behavior/Characteristics of program.
     *
    */
    public static void main(String [] args) {
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println(rectangle.CalculateArea());
        Square square = new Square(30);
        System.out.println(square.CalculateArea());
        useRectangle(rectangle);
        useSquare(square);
    }

    private static void useSquare(Square square) {
        square.setSide(30);
        assert square.getSide() == 30;
    }

    public static void useRectangle(Rectangle rectangle){
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        assert rectangle.getWidth() == 30;
        assert rectangle.getHeight() == 20;
    }
}
