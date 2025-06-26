public class ExCar {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public ExCar(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        wheels = 4;
        engine = true;
    }

    public String startEngine() {
        return getClass().getSimpleName() + "'s engine is starting.";
    }
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating.";
    }
    public String brake() {
        return getClass().getSimpleName() + " is braking.";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends ExCar {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return getName() + "'s engine is starting and smoking.";
    }
    @Override
    public String accelerate() {
        return getName() + " is accelerating very fast.";
    }
    @Override
    public String brake() {
        return getName() + " is braking hard.";
    }
}

class Holden extends ExCar {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "'s engine is starting quietly.";
    }
    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating slowly.";
    }
    @Override
    public String brake() {
        return getClass().getSimpleName() + " is braking carefully.";
    }
}

class Ford extends ExCar {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "'s engine is starting and roaring.";
    }
    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating extremely fast.";
    }
    @Override
    public String brake() {
        return getClass().getSimpleName() + " slams hard on the brakes.";
    }
}
