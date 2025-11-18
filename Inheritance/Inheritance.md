## What is Inheritance?
Inheritance in Java enables a class to inherit properties and actions from another class, called a superclass or parent class. A class derived from a superclass is called a subclass or child group. Through inheritance, a subclass can access members of its superclass (fields and methods), enforce reuse rules, and encourage hierarchy.

Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

## Why use inheritance?
* For Method Overriding (so runtime polymorphism can be achieved).
* For Code Reusability.

### Terms used in Inheritance
* **Class**: A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.
* **Sub Class/Child Class**: Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.
* **Super Class/Parent Class**: Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.
* **Reusability**: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class. You can use the same fields and methods already defined in the previous class.

## Syntax of Inheritance
~~~
class A extends B{}
~~~
## flow Diagram 
![img.png](img.png)
## Code Examples
~~~
class Employee{  
 float salary=40000;  
}  
class Programmer extends Employee{  
 int bonus=10000;  
}  
public class Main{  
 public static void main(String args[]){  
   Programmer p=new Programmer();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}  
~~~
---
## Types of Inheritance in Java
On the basis of class, there can be three types of inheritance in java: single, multilevel and hierarchical.

In Java programming, multiple and hybrid inheritance is supported through interface only

## Single Inheritance
When a class inherits another class, it is known as a single inheritance. In the example given below, Dog class inherits the Animal class, so there is the single inheritance.
![img_1.png](img_1.png)
~~~
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
public class Main{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
d.eat();  
}}  
~~~
