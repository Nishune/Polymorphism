public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine is started");
    }
    public void drive() {
        System.out.println("Driving");
    }
    protected void runEngine() {
        System.out.println("Running Engine..");
    }

    public String getDescription() {
        return description;
    }
}

class GasPoweredCar extends Car {

    private Double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Using GasPoweredCar");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        avgKmPerLitre = 0.4;
        System.out.println("Consuming  " + avgKmPerLitre * 10 + "L per swedish mile.");
    }
    @Override
    public void drive() {
        cylinders = 4;
        System.out.println("Driving on " + cylinders + " cylinders.");
    }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        System.out.println("Pressing a button to boot up " + getClass().getSimpleName());
        super.startEngine();
    }

    @Override
    protected void runEngine() {
        batterySize = 4;
        avgKmPerCharge = 500;
        System.out.println("This car can reach " + avgKmPerCharge / 10 + " European miles per charge");
    }

    @Override
    public void drive() {
        batterySize = 4;
        System.out.println(getClass().getSimpleName() + " is running on " + batterySize + " batteries");
    }
}

class HybridCar extends Car {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        System.out.println("Pressing a button to boot up " + getClass().getSimpleName());
        super.startEngine();
    }
    @Override
    protected void runEngine() {
        batterySize = 4;
        cylinders = 4;
        System.out.println("The car is running on " + batterySize + " batteries and " + cylinders + " cylinders.");
    }
    @Override
    public void drive() {
        avgKmPerLitre = 18;
        System.out.println("The car is now driving on both battery and cylinders. The consumption per litre is " + avgKmPerLitre + " L");
    }
}
