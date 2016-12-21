package logic.train;

import logic.train.cart.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainValidator {

    private Map<String, Restriction> carRestrictions;

    public TrainValidator() {
        carRestrictions = new HashMap<>();
    }

    public void addRestriction(String carType, int minimum) {
        carRestrictions.put(carType, new Restriction(minimum, Integer.MAX_VALUE));
    }

    public void addRestriction(String carType, int minimum, int maximum) {
        carRestrictions.put(carType, new Restriction(minimum, maximum));
    }

    public List<String> validate(Train train) {
        Map<String, Integer> trainComposition = getTrainComposition(train);
        List<String> unmetRestrictions = new ArrayList<>();

        for (String key : carRestrictions.keySet()) {
            Restriction restriction = carRestrictions.get(key);

            if (trainComposition.containsKey(key)) {
                Integer numberOfCars = trainComposition.get(key);

                if (numberOfCars < restriction.min) {
                    unmetRestrictions.add(formatMinimum(key, restriction.min, numberOfCars));
                } else if (numberOfCars > restriction.max) {
                    unmetRestrictions.add(formatMaximum(key, restriction.max, numberOfCars));
                }
            } else {
                if (restriction.min > 0) {
                    unmetRestrictions.add(formatMinimum(key, restriction.min, 0));
                }
            }
        }

        return unmetRestrictions;
    }

    public Map<String, Integer> getTrainComposition(Train train) {
        Map<String, Integer> carCounter = new HashMap<>();
        Car[] cars = train.getCars();

        for (Car car : cars) {
            String currentCarType = car.getCarType();

            if (carCounter.containsKey(currentCarType)) {
                int previousCount = carCounter.get(currentCarType);
                carCounter.put(currentCarType, ++previousCount);
            } else {
                carCounter.put(currentCarType, 1);
            }
        }

        return carCounter;
    }

    private String formatMinimum(String type, int minimum, int current) {
        return String.format("Unmet restriction for type: %s, the min is: %d, the train has: %d",
                type, minimum, current);
    }

    private String formatMaximum(String type, int maximum, int current) {
        return String.format("Unmet restriction for type: %s, the max is: %d, the train has: %d",
                type, maximum, current);
    }

    private class Restriction {
        int min;
        int max;

        Restriction(int minimum, int maximum) {
            this.min = minimum;
            this.max = maximum;
        }
    }
}
