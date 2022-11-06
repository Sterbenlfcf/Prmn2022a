package lecture02;

public class Car2 {

    int fuel;
    Tire[] tires;
    Engine engine;

    Car2(Tire[] tires, Engine engine){
        this.fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }

    void run(){

        if(this.fuel > 0) {
            System.out.println("fuelを1消費して走りました。");
        }else{
            System.out.println("fuelが足りないため走れませんでした。");
        }
    }

    void startEngine(){
        this.engine.start();
    }
}
