package javaoop.designpattern.observer;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Customer customer1 = new Customer("Ti", 11);
        Customer customer2 = new Customer("Teo", 12);

        Product product1 = new Product("Laptop");
        // cus1 dang ky phan ung khi có thông báo từ product
        product1.attachObserver(customer1);

        product1.attachObserver(customer2);

        product1.notifyObserver();
    }

}
