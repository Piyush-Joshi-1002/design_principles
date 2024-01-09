package org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory;

import org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory.Vehicle.Luxuar_Vehicle.BMW;
import org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory.Vehicle.Luxuar_Vehicle.LandRover;
import org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory.Vehicle.Luxuar_Vehicle.Porsche;
import org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory.Vehicle.Ordinary_Vehicle.MarutiSuzuki;
import org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory.Vehicle.Ordinary_Vehicle.TataPunch;
import org.example.Factory_method_Pattern.AbstractFactoryPattern.AbstractFactory.VehicleFactory.Vehicle.Vehicle;

public class OrdinaryVehicleFactory implements Vehicle_Factory{
    @Override
    public Vehicle getVehicle(String vehicle) {

        switch (vehicle){
            case("BMW") : return new BMW();
            case("LandRover") : return new LandRover();
            case("Porsche") : return new Porsche();
            default:return null;
        }

    }
}
