package models;

public class Car {
    private String model;
    private int maxSpeed;

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void showCarInfo() {
        System.out.println("🚗 Car: " + model + " | Max Speed: " + maxSpeed + " km/h");
    }
}

