package javaoop.designpattern.factorymethod;

public class Rectangle implements Shape {
    
    @Override
    public void draw() {
        System.out.println("Inside Reactangle::draw() method.");
    }
}
