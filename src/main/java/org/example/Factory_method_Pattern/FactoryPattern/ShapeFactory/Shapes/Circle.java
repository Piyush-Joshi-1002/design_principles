package org.example.Factory_method_Pattern.FactoryPattern.ShapeFactory.Shapes;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("This object is capable of drawing Circle ");
    }
}
