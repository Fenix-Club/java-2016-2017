package logic.train;

import logic.train.cart.Car;

import java.util.Iterator;
import java.util.LinkedList;

public class Train {

    private static final String CAR_CONNECTOR_STRING = "--";

    private LinkedList<Car> cars;

    public Train() {
        cars = new LinkedList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(int index) {
        cars.remove(index);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public void swapCars(int first, int second) {
        Car firstCar = cars.get(first);
        Car secondCar = cars.get(second);

        cars.set(first, secondCar);
        cars.set(second, firstCar);
    }

    public Car[] getCars() {
        return cars.toArray(new Car[0]);
    }

    public String displayTrain() {
        StringBuilder builder = new StringBuilder();
        Iterator<Car> iterator = cars.iterator();

        builder.append(iterator.next().drawCar());

        while (iterator.hasNext()) {
            builder.append(CAR_CONNECTOR_STRING)
                    .append(iterator.next().drawCar());
        }

        return builder.toString();
    }
}
