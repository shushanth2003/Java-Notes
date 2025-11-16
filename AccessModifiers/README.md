## Access Modifier
access modifiers are essential tools that define how the members of a class, like variables, methods, and even the class itself, can be accessed from other parts of our program.
![img.png](img.png)

## Private Access Modifier
The private access modifier is specified using the keyword private. The methods or data members declared as private are accessible only within the class in which they are declared.
~~~ java
class Person {

    // private variable
    private String name;

    public void setName(String name)  {

        this.name = name; // accessible within class
    }

    public String getName() { return name; }
}

public class Geeks {
    public static void main(String[] args)
    {

        Person p = new Person();
        p.setName("Alice");

        // System.out.println(p.name); // Error: 'name'
        // has private access
        System.out.println(p.getName());
    }
}
~~~