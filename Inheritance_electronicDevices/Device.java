package Inheritance_electronicDevices;

public class Device {
    private String name;
    private double width;
    private double height;
    private double mass;

    public Device(String name, double width, double height, double mass) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
