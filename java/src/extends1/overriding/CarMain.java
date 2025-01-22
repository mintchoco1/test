package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElelctricCar car = new ElelctricCar();
        car.move();
        car.charge();
        car.opendoor();

        GasCar gas = new GasCar();
        gas.move();
        gas.fillup();
        gas.opendoor();

        HydrogenCar hyd = new HydrogenCar();
        hyd.move();
        hyd.fillhydrogen();
        hyd.opendoor();
    }
}
