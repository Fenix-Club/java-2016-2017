package logic;

public class LandlinePhone extends Phone {

    public LandlinePhone() {
        super();
    }

    @Override
    public void call(String phoneNumber) {
        System.out.printf("Calling the number: %s over a landline network . . .\n", phoneNumber);
    }
}
