class Persons{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class Person {
    public static void main(String[] args){
        Persons p=new Persons();
        p.setName("Shushanth");
        System.out.println(p.getName());
    }
}
