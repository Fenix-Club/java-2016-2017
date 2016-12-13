package logic;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String deviceModel;
    private String serialNumber;
    private int productionYear;

    private List<Contact> contacts;

    public MobilePhone() {
        deviceModel = "A0003T";
        serialNumber = "XDA-123-010";
        productionYear = 2016;

        contacts = new ArrayList<>();
    }

    public MobilePhone(String model, String serial, int production) {
        deviceModel = model;
        serialNumber = serial;
        productionYear = production;

        contacts = new ArrayList<>();
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int year) {
        // A naive way of checking the argument
        if (year > 1990) {
            productionYear = year;
        }
    }

    public void call(String phoneNumber) {
        // Some logic to call the provided phone number
    }

    public boolean equals(MobilePhone otherPhone) {
        return deviceModel.equals(otherPhone.getDeviceModel()) &&
                productionYear == otherPhone.getProductionYear();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.printf("Name: %s, number: %s\n", contact.getContactName(), contact.getPhoneNumber());
        }
    }
}
