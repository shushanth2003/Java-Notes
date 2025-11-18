class Persons{
    String firstName;
    String lastName;
    public Persons(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    @Override
    public String toString() {
        return "Persons{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
public class Person {
    public static void main(String[] args) {
        Persons persons=new Persons("Shushanth Babyrani","Senthilnathan");
        System.out.println("Full Name of the candidates : "+persons.toString());
    }
}
