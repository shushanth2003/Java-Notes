class Employeeses{
    String name;
    int id;

    //setter Employees details
    public void setId(int id) {
        this.id=1;
    }
    public void setName(String name){
        this.name="Shushanth";
    }

    //getter Employees details
    public int getId(){
        return id;
    }
    public String  getName(){
        return name;
    }
}
public class Employees {
    public static void main(String[] args){
        Employeeses employeeses=new Employeeses();
        employeeses.setId(1);
        employeeses.setName("Shushanth");

        //get the data from Employee
        System.out.println(employeeses.getId());
        System.out.println(employeeses.getName());
    }
}
