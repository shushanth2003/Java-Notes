class Animals{
    public void barking(){
        System.out.println("Animal will barking");
    }
}
class Dog extends Animals{
    public void eating(){
        System.out.println("It will be eat veg and non veg");
    }
}
public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.barking();
        dog.eating();
    }
}
