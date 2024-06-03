package Inheritance_electronicDevices;

public class ElectronicDevice extends Device implements PowerControllable {
    private double voltage;
    private boolean isActive;

    public ElectronicDevice(String name, double width, double height, double mass, double voltage, boolean isActive) {
        super(name, width, height, mass);
        this.voltage = voltage;
        this.isActive = isActive;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public void turnOn() {
        this.isActive = true;
    }

    @Override
    public void turnOff() {
        this.isActive = false;
    }
}