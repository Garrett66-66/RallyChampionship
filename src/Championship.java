package services;

import models.Race;
import java.util.ArrayList;
import java.util.List;

public class Championship {
    private static Championship instance;
    private List<Race> races;

    private Championship() {
        this.races = new ArrayList<>();
    }

    public static Championship getInstance() {
        if (instance == null) {
            instance = new Championship();
        }
        return instance;
    }

    public void addRace(Race race) {
        races.add(race);
    }

    public void showStandings() {
        System.out.println("📊 Championship Standings:");
        for (Race race : races) {
            System.out.println("🏆 Race: " + race);
        }
    }
}
