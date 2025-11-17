interface Vehicle{
    void speedUp(int a);
    void applyBrake(int a);
    void gearUp(int a);
}
class Bicylc implements Vehicle{
    int speed,gear;

    @Override
    public void speedUp(int inc) {
        speed+=inc;
    }

    @Override
    public void applyBrake(int dec) {
        speed-=dec;
    }

    @Override
    public void gearUp(int inc) {
        gear+=inc;
    }

    //print states
    public void bicycleDisplayStates(){
        System.out.println("Bicycle Print States : "+ "Speed : "+speed+" Gear : "+gear);
    }
}
class Bike implements Vehicle {
    int speed,gear;

    @Override
    public void speedUp(int inc) {
        speed+=inc;
    }

    @Override
    public void applyBrake(int dec) {
        speed-=dec;
    }

    @Override
    public void gearUp(int inc) {
        gear+=inc;
    }

    //print states
    public void bikeDisplayStates(){
        System.out.println("Bike Print States : "+ "Speed : "+speed+" Gear : "+gear);
    }
}
public class Transport {
    public static void main(String[] args) {
        //Bicylce Print States
        Bicylc bicylc=new Bicylc();
        bicylc.gearUp(2);
        bicylc.speedUp(2);
        bicylc.applyBrake(1);
        bicylc.bicycleDisplayStates();

        //Bike Print States
        Bike bike=new Bike();
        bike.gearUp(2);
        bike.speedUp(2);
        bike.applyBrake(1);
        bike.bikeDisplayStates();
    }
}
