class Employee{
    // initialize the variables
    String name;
    int salary;

    //constructor
    public Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }

    //setter function
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    //getter function
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

    // display the output
    public void displayEmployeeDetails(){
        System.out.println("Employee name : "+name);
        System.out.println("Employee salary : "+salary);
    }

}
public class Objects {
    public static void main(String[] args) {
        Employee employee=new Employee("shushanth",26500);
        employee.displayEmployeeDetails();
    }
}
