public class CarMain {

    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);
        System.out.println("\n");

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);
        System.out.println("\n");

        Car tesla = new ElectricCar("Tesla Model X", 7.4, 6);
        runRace(tesla);

    }

    public static void runRace (Car car) {

        car.startEngine();
        car.drive();
    }
}