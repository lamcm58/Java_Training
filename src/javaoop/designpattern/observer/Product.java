package javaoop.designpattern.observer;

import java.awt.List;
import java.util.ArrayList;

public class Product implements Subject {
    private ArrayList<Observer> obs = new ArrayList<>();
    private String nameProduct;
    
    public Product(String nameProduct) {
        // TODO Auto-generated constructor stub
        super();
        this.nameProduct = nameProduct;
    }
    
    @Override
    public void attachObserver(Observer observer) {
        obs.add(observer);
    }
    
    @Override
    public void detachObserver(Observer observer) {
        obs.remove(observer);
    }
    
    @Override
    public void notifyObserver() {
        for (Observer ob : obs) {
            ob.update(nameProduct);
        }
    }
}
