package org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory;

import org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory.Vehicle.Vehicle;

public interface Vehicle_Factory {
    Vehicle getVehicle(String vehicle);
}
