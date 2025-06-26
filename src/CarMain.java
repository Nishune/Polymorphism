public class CarMain {

    public static void main(String[] args) {


        GasPoweredCar dieselCar = new GasPoweredCar("Volkswagen Diesel");
        System.out.println(dieselCar.getDescription());
        dieselCar.startEngine();
        dieselCar.runEngine();
        dieselCar.drive();
        System.out.println("\n");

        ElectricCar tesla = new ElectricCar("Tesla");
        System.out.println(tesla.getDescription());
        tesla.startEngine();
        tesla.runEngine();
        tesla.drive();
        System.out.println("\n");

        HybridCar mitsubishi = new HybridCar("Mitsubishi");
        System.out.println(mitsubishi.getDescription());
        mitsubishi.startEngine();
        mitsubishi.runEngine();
        mitsubishi.drive();
    }
}
