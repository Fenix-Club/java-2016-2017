package logic;

public abstract class Phone implements CallInterface {

    private String deviceModel;
    private String serialNumber;
    private int productionYear;

    public Phone() {
        deviceModel = "Default model";
        serialNumber = "Default serial";
        productionYear = 2016;
    }

    public Phone(String model, String serial, int production) {
        deviceModel = model;
        serialNumber = serial;
        productionYear = production;
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
}
