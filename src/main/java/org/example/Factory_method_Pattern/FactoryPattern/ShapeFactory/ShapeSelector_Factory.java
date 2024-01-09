package org.example.Factory_method_Pattern.FactoryPattern.ShapeFactory;

import org.example.Factory_method_Pattern.FactoryPattern.ShapeFactory.Shapes.Circle;
import org.example.Factory_method_Pattern.FactoryPattern.ShapeFactory.Shapes.Rectangle;
import org.example.Factory_method_Pattern.FactoryPattern.ShapeFactory.Shapes.Shape;
import org.example.Factory_method_Pattern.FactoryPattern.ShapeFactory.Shapes.Triangle;

public class ShapeSelector_Factory {
    public Shape getShape(String Shape){
        switch (Shape){
            case("Circle"): return new Circle();
            case("Rectangle"): return new Rectangle();
            case("Triangle"): return new Triangle();
            default: return null;
        }
    }
}
