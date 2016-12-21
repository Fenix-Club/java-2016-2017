package logic.train.cart;

public class Locomotive extends Car {

    public static final String CAR_TYPE = "locomotive";

    private int power;
    private int range;

    public Locomotive() {
        power = 2000;
        range = 1000;
    }

    @Override
    public String drawCar() {
        return "<__||__]";
    }

    @Override
    public String getCarType() {
        return CAR_TYPE;
    }
}
