## Java Interface
An Interface in Java is an abstract type that defines a set of methods a class must implement.

* An interface acts as a contract that specifies what a class should do, but not how it should do it. It is used to achieve abstraction and multiple inheritance in Java. We define interfaces for capabilities (e.g. Comparable, Serializable, Drawable).
* A class that implements an interface must implement all the methods of the interface. Only variables are public static final by default.
* Prior to Java 8, interfaces could only have abstract methods (no bodies). Since Java 8, they can also include default and static methods (with implementation), and since Java 9, private methods are allowed.

## Relationship Between Class and Interface
A class can extend another class and similarly, an interface can extend another interface. However, only a class can implement an interface and the reverse (an interface implementing a class) is not allowed.
![img.png](img.png)

