class A{
    public void display(){
        System.out.println("A");
    }
}
class B{
    public void display(){
        System.out.println("B");
    }
}
public class Multiple extends A{
    public static void main(String[] args) {
        Multiple multiple =new Multiple();
        multiple.display();
    }
}
