package org.example.Factory_method_Pattern.FactoryPattern.ShapeFactory.Shapes;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("lets drow ABC (Where let ABC is triangle) ");
    }
}
