package logic.train.cart.passenger;

import logic.train.cart.Car;

public abstract class PassengerCar extends Car {

    private int capacity;

    public PassengerCar() {
        this.capacity = 100;
    }

    public PassengerCar(int capacity) {
        this.capacity = capacity;
    }
}
