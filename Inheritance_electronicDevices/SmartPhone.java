package Inheritance_electronicDevices;

public class SmartPhone extends ElectronicDevice {
    private String os;
    private int hddCapacity;
    private int memory;
    private int cameraResolution;
    private String brand;
    private double batteryCurrent;

    public SmartPhone(String os, int hddCapacity, int memory, int cameraResolution, String brand, double batteryCurrent, String name, double width, double height, double mass, double voltage, boolean isActive) {
        super(name, width, height, mass, voltage, isActive);
        this.os = os;
        this.hddCapacity = hddCapacity;
        this.memory = memory;
        this.cameraResolution = cameraResolution;
        this.brand = brand;
        this.batteryCurrent = batteryCurrent;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getHddCapacity() {
        return hddCapacity;
    }

    public void setHddCapacity(int hddCapacity) {
        this.hddCapacity = hddCapacity;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getBatteryCurrent() {
        return batteryCurrent;
    }

    public void setBatteryCurrent(double batteryCurrent) {
        this.batteryCurrent = batteryCurrent;
    }
    
    @Override
    public void turnOn(){
        System.out.println("Phone is turning on!");
    }
    @Override
    public void turnOff(){
        System.out.println("Phone is turning off!");
    }
}
