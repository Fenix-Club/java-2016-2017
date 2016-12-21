package logic.train.cart.passenger;

import logic.train.cart.Car;

public class NonCompartmentCar extends Car {

    public static final String CAR_TYPE = "non_compartment_car";

    @Override
    public String drawCar() {
        return "[__NON-COMP__]";
    }

    @Override
    public String getCarType() {
        return CAR_TYPE;
    }
}
