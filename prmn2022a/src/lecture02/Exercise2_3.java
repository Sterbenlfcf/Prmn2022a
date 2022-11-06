package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {

        Tire[] tires = new Tire[4];
        for(int i = 0; i < 4; i++){
            tires[i] = new Tire(65);
        }

        Engine engine = new Engine(4000);

        Car2 car = new Car2(tires, engine);
        GasStation2 gs = new GasStation2();

        gs.refuel(car);
        car.startEngine();
        car.run();

    }
}
