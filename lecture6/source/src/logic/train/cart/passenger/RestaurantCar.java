package logic.train.cart.passenger;

public class RestaurantCar extends PassengerCar {

    public static final String CAR_TYPE = "restaurant_car";

    @Override
    public String drawCar() {
        return "[__WARS__]";
    }

    @Override
    public String getCarType() {
        return CAR_TYPE;
    }
}
