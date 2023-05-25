/**
 * How to create Singleton design pattern?
 * To create the singleton class, we need to have static member of class, private constructor and static factory method.
 *
 * Static member: It gets memory only once because of static, itcontains the instance of the Singleton class.
 * Private constructor: It will prevent to instantiate the Singleton class from outside the class.
 * Static factory method: This provides the global point of access to the Singleton object and returns the instance to the caller.
 *
 */

public class A {

    private static A obj = new A(); // A instance will be created at load time

    private A() {

    }

    public static A getA() {
        return obj;
    }

    public void doSomething() {
        // write your code
    }
}
