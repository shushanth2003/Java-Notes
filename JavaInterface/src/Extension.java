interface A{
    public void methodA();
    public void methodB();
}
interface B extends A{
    public void methodC();
}
class C implements B{

    @Override
    public void methodC() {
        System.out.println("Method C");
    }

    @Override
    public void methodA() {
        System.out.println("Method B");
    }

    @Override
    public void methodB() {
        System.out.println("Method A");
    }
}
public class Extension {
    public static void main(String[] args) {
        C C=new C();
        C.methodA();
        C.methodB();
        C.methodC();
    }
}
