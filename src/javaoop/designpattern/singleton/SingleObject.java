package javaoop.designpattern.singleton;

public class SingleObject {
    // Create an object of SingleObject
    private static SingleObject instance = new SingleObject();
    
    // make the constructor private so that this class cannot be instanced
    private SingleObject() {}
    
    // Get the only object available
    public static SingleObject getInstance() {
        return instance;
    }
    
    public void showMessage() {
        System.out.println("Hello World.");
    }
}
