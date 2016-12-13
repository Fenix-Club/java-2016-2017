package logic;

public class MobilePhone extends Phone implements LocationInterface {

    public MobilePhone() {
        super();
    }

    public MobilePhone(String model, String serial, int production) {
        super(model, serial, production);
    }

    @Override
    public void call(String phoneNumber) {
        System.out.printf("Calling the number: %s over a GSM network . . .\n", phoneNumber);
    }

    @Override
    public double[] getPosition() {
        System.out.printf("Getting the geolocation of phone model: %s . . .\n", getDeviceModel());
        return new double[0];   // Return a dud, we're not actually locating anything here
    }
}
