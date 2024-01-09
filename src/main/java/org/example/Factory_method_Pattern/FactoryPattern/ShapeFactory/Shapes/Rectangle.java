package org.example.Factory_method_Pattern.FactoryPattern.ShapeFactory.Shapes;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle is Drawing perfectly");
    }
}
