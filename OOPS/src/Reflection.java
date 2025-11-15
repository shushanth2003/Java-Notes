import java.lang.reflect.InvocationTargetException;

class Student{
    public Student() {};
}
public class Reflection{
    public static void main(String[] args) {
        try{
            Class<?> c=Class.forName("Student");
            Student s=(Student) c.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("class is not found");
        }catch(NoSuchMethodException e){
            System.out.println("Method is not found");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
