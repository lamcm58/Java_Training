package javaoop.designpattern.observer;

public interface Subject {
    // thêm đối tượng đăng ký lắng nghe thông báo.
    public void attachObserver(Observer observer);

    // hủy đối tượng đăng ký lắng nghe thông báo.
    public void detachObserver(Observer observer);

    // thong bao đến tất cả các đối tượng đã đăng ký thông báo.
    public void notifyObserver();
}
