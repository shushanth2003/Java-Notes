class Vehicle{
    protected int speed;
    public void setSpeed(){
        this.speed=10;
    }
    public int getSpeed(){
        return speed;
    }
}
class Bike extends Vehicle{

}
public class Bikes {
    public static void main(String[] args) {
        Bike bike =new Bike();
        bike.setSpeed();
        System.out.println(bike.getSpeed());
    }
}
