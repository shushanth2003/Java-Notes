class Parent{
    //overloading subclass
    public void func(){
        System.out.println("calling 1");
    }

    public void func(int a){
        System.out.println("calling "+a);
    }
}


class Child extends Parent{
    //overriding

    @Override
    public void func() {
        super.func();
    }
}

public class BloodRelation {
    public static void main(String[] args) {
        Child child=new Child();
        child.func();
    }
}