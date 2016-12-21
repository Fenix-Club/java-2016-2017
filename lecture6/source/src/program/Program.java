package program;

import logic.train.Train;
import logic.train.TrainValidator;
import logic.train.cart.Locomotive;
import logic.train.cart.passenger.CompartmentCar;
import logic.train.cart.passenger.NonCompartmentCar;
import logic.train.cart.passenger.RestaurantCar;

import java.util.List;
import java.util.Map;

public class Program {

    public static void main(String[] args) {
        Train testTrain = new Train();

        testTrain.addCar(new Locomotive());
        testTrain.addCar(new CompartmentCar());
        testTrain.addCar(new RestaurantCar());
        testTrain.addCar(new NonCompartmentCar());
        testTrain.addCar(new CompartmentCar());
        testTrain.addCar(new NonCompartmentCar());

        System.out.printf("Initial train: \n%s\n", testTrain.displayTrain());

        testTrain.removeCar(2);

        System.out.printf("Train after a removal: \n%s\n", testTrain.displayTrain());

        testTrain.swapCars(2, 3);

        System.out.printf("Train after a swap: \n%s\n", testTrain.displayTrain());

        TrainValidator validator = new TrainValidator();
        Map<String, Integer> composition = validator.getTrainComposition(testTrain);

        System.out.println("\nThe train composition is:");
        for (String key : composition.keySet()) {
            System.out.printf("Type: %s, number: %d\n", key, composition.get(key));
        }

        validator.addRestriction(Locomotive.CAR_TYPE, 1);
        validator.addRestriction(RestaurantCar.CAR_TYPE, 1);
        validator.addRestriction(NonCompartmentCar.CAR_TYPE, 2, 3);
        validator.addRestriction(CompartmentCar.CAR_TYPE, 0, 1);

        System.out.println("\nValidating the train");
        List<String> validationResults = validator.validate(testTrain);
        for (String error : validationResults) {
            System.out.println(error);
        }
    }
}
