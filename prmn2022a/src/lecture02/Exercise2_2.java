package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {

        Car car = new Car();
        GasStation gs = new GasStation();

        car.run();
        gs.refuel(car);
        car.run();

    }
}
