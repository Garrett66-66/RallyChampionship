import models.Car;
import models.Driver;
import models.Race;
import services.Championship;

public class Main {
    public static void main(String[] args) {
        System.out.println("🏁 Welcome to the Rally Championship Management System!");


        Car car1 = new Car("Toyota GR Yaris", 250);
        Car car2 = new Car("Ford Fiesta WRC", 230);
        Driver driver1 = new Driver("Tom", car1);
        Driver driver2 = new Driver("Jerry", car2);

        Race race = new Race("Finland Rally", 300);
        race.addDriver(driver1);
        race.addDriver(driver2);

        race.startRace();


        Championship championship = Championship.getInstance();
        championship.addRace(race);
        championship.showStandings();
    }
}
