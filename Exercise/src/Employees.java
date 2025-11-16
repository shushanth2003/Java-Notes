class Employee{
    private String name;
    private int id;
    private String department;

    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
    public Employee(String name,int id,String department){
        this.name=name;
        this.id=id;
        this.department=department;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee Name : "+name);
        if(id!=0){
            System.out.println("Employee id :"+id);
        }
        if(department!=null){
            System.out.println("Employee Department :"+department);
        }
    }
}
public class Employees {
    public static void main(String[] args) {
        Employee employee1=new Employee("Shushanth",1,"Artificial Intelligence and Data Science");
        Employee employee2=new Employee("RamGopal Varma",2);
        employee1.displayEmployeeDetails();
        employee2.displayEmployeeDetails();
    }
}
