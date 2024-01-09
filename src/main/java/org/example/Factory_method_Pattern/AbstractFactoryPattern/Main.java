package org.example.Factory_method_Pattern.AbstractFactoryPattern;

import org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.AbstractFactoryClass;
import org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory.Vehicle_Factory;

public class Main {
    AbstractFactoryClass abstractFactoryClass = new AbstractFactoryClass();
    Vehicle_Factory ordinaryVehicles = abstractFactoryClass.getVehicleFactory("Ordinary");

    Vehicle_Factory luxuryVehicles = abstractFactoryClass.getVehicleFactory("Luxury");

    public Vehicle_Factory getOrdinaryVehicles() {
        return ordinaryVehicles;
    }

    public Vehicle_Factory getLuxuryVehicles() {
        return luxuryVehicles;
    }
}
