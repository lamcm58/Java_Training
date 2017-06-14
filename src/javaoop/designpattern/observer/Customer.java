package javaoop.designpattern.observer;

public class Customer implements Observer {
    private String name;
    private int age;
    
    public Customer(String name, int age) {
        // TODO Auto-generated constructor stub
        super();
        this.name = name;
        this.age = age;
    }
    
    @Override
    public void update(String name) {
        System.out.println(name + " " + age);
    }
}
