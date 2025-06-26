public class ExCarMain {

    public static void main(String[] args) {

        ExCar excar = new ExCar(4, "Ferrari");
        testCar(excar);

        ExCar Mitsubishi = new Mitsubishi(4, "Mitsubishi");
        testCar(Mitsubishi);

        ExCar ford = new Ford(4, "Ford");
        testCar(ford);

        ExCar holden = new Holden(4, "Holden");
        testCar(holden);

    }

    public static void testCar (ExCar excar) {
        System.out.println(excar.startEngine());
        System.out.println(excar.accelerate());
        System.out.println(excar.accelerate());
    }
}
