interface TestStudentName{
    final int id = 0;
    public void displayDetails();
}
class Person implements TestStudentName{
    @Override
    public void displayDetails() {
        System.out.println("Interface Student in it");
    }
}
public class Student {
    public static void main(String[] args) {
        Person p=new Person();
        p.displayDetails();
    }
}
