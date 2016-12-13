package program;

import logic.LandlinePhone;
import logic.MobilePhone;

public class Program {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();

        mobilePhone.call("123 456 789");
        mobilePhone.getPosition();

        LandlinePhone landlinePhone = new LandlinePhone();

        landlinePhone.call("123 456 789");
    }
}
