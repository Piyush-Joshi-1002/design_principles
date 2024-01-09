package org.example.Factory_method_Pattern.FactoryPattern;

import org.example.Factory_method_Pattern.FactoryPattern.ShapeFactory.ShapeSelector_Factory;
import org.example.Factory_method_Pattern.FactoryPattern.ShapeFactory.Shapes.Shape;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*ShapeSelector_Factory shapeSelectorFactory = new ShapeSelector_Factory();
        Shape circle =  shapeSelectorFactory.getShape("Circle");
        Shape rectangle = shapeSelectorFactory.getShape("Rectangle");
        Shape triangle = shapeSelectorFactory.getShape("Triangle");
        circle.draw();
        rectangle.draw();
        triangle.draw();*/

        List<Integer> list = List.of(1000,2000,30000,4000,50000,600);
        int ts = 6000;
        Stream<Integer> result = list.stream()
                .filter(value -> value <= ts  );
        System.out.println(result);
        result.forEach(System.out::println);
    }
}
