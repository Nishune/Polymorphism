public class CarMain {

    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);
        System.out.println("\n");

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);
        System.out.println("\n");

        Car tesla = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Ferrari Hybrid", 500, 6, 35);
        runRace(ferrariHybrid);

    }

    public static void runRace (Car car) {

        car.startEngine();
        car.drive();
        car.runEngine();
    }
}