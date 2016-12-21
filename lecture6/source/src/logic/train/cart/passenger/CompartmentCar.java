package logic.train.cart.passenger;

public class CompartmentCar extends PassengerCar {

    public static final String CAR_TYPE = "compartment_car";

    private int numberOfCompartments;

    public CompartmentCar() {
        super();
        numberOfCompartments = 10;
    }

    public CompartmentCar(int capacity, int numberOfCompartments) {
        super(capacity);
        this.numberOfCompartments = numberOfCompartments;
    }

    @Override
    public String drawCar() {
        return "[__COMP__]";
    }

    @Override
    public String getCarType() {
        return CAR_TYPE;
    }
}
