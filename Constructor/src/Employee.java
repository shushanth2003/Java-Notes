class Employees{
    int id;
    String name;
    public Employees(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Employees(Employees e1){
        e1.id=id;
        e1.name=name;
    }
    public void displayEmployees(){
        System.out.println("Employee id : "+id);
        System.out.println("Employee Name :"+name);
    }
}
public class Employee {
    Employees employees=new Employees(1,"Shushanth");
    Employees employee=new Employees(employees);

}
