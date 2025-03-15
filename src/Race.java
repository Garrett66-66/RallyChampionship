package models;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private String location;
    private int distance;
    private List<Driver> participants;

    public Race(String location, int distance) {
        this.location = location;
        this.distance = distance;
        this.participants = new ArrayList<>();
    }

    public void addDriver(Driver driver) {
        participants.add(driver);
    }

    public void startRace() {
        System.out.println("🏁 The race at " + location + " has started!");
        for (Driver driver : participants) {
            System.out.println(driver.getName() + " is racing in a " + driver.getCar().getModel());
        }
    }
}
