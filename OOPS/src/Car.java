abstract class Vehicle{
    abstract void brake();
    abstract void accelerate();

    //start Engine
    void startEngine(){
        System.out.println("Vehicle is started...");
    }
}
class Cars extends Vehicle{
    void brake(){
        System.out.println("Apply the brake....");
    }
    void accelerate(){
        System.out.println("Apply the accelerate....");
    }
}
public class Car {
    public static void main(String[] args) {
        Cars cars =new Cars();
        //start the engine
        cars.startEngine();
        //apply brake
        cars.brake();
        //apply accelerate
        cars.accelerate();
    }
}
