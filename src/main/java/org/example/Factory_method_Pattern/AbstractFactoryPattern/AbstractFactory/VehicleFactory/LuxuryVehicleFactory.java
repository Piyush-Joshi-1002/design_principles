package org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory;

import org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory.Vehicle.Ordinary_Vehicle.MarutiSuzuki;
import org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory.Vehicle.Ordinary_Vehicle.TataPunch;
import org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory.Vehicle.Vehicle;

public class LuxuryVehicleFactory implements Vehicle_Factory{
    @Override
    public Vehicle getVehicle(String vehicle) {
        switch (vehicle){
            case("MarutiSuzuki") : return new MarutiSuzuki();
            case("TataPunch") : return new TataPunch();
            default:return null;
        }
    }
}
