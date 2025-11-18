class Operation{
    int num;
    public Operation(int num){
        this.num=num;
    }
    public int square(){
        return num*num;
    }
}
class Circle{
    Operation op;
    double radius=3.14;
    int r;
    public Circle(int r){
        this.r=r;
    }
    public void displayAreaCircle(){
        op=new Operation(r);
        int square=op.square();
        int res=(int)radius*square;
        System.out.println("Area of the circle : "+res);
    }
}
public class Circles {
    public static void main(String[] args) {
        Circle circle=new Circle(10);
        circle.displayAreaCircle();
    }
}
