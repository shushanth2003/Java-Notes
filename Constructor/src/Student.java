public class Student {
    int id;
    String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void displayStudent(){
        System.out.println(id);
        System.out.println(name);
    }
    public static void main(String[] args){
        Student s=new Student(1,"Shushanth");
        s.displayStudent();
    }
}
