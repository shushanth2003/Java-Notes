class Animal{
    public void eat(){
        System.out.println("Lion will be living organisms");
    }
    public void sleep(){
        System.out.println("Animal will be sleep");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is Barking");
    }
    public void hunt(){
        System.out.println("Dog will be not huntering");
    }
}
public class Animals {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.bark();
        dog.hunt();
    }
}
