package program;

import logic.MobilePhone;

public class Program {

    public static void main(String[] args) {
        MobilePhone testPhone = new MobilePhone();

        System.out.println("Default phone fields:");

        System.out.println(testPhone.getDeviceModel());
        System.out.println(testPhone.getSerialNumber());
        System.out.println(testPhone.getProductionYear());

        MobilePhone testPhone2 = new MobilePhone("some model", "123XYZ", 2005);

        System.out.println("Fields set through the constructor:");

        System.out.println(testPhone2.getDeviceModel());
        System.out.println(testPhone2.getSerialNumber());
        System.out.println(testPhone2.getProductionYear());
    }
}
