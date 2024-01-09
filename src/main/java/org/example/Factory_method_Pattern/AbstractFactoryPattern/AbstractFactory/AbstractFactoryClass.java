package org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory;

import org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory.LuxuryVehicleFactory;
import org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory.OrdinaryVehicleFactory;
import org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory.Vehicle_Factory;

public class AbstractFactoryClass {


    public Vehicle_Factory getVehicleFactory(String vehicleFactory){
        switch (vehicleFactory){
            case("Ordinary") : return new OrdinaryVehicleFactory();
            case("Luxury") : return new LuxuryVehicleFactory();
            default: return null;
        }
    }
}
