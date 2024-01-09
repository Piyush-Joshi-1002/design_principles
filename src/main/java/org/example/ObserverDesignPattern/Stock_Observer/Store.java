package org.example.ObserverDesignPattern.Stock_Observer;

import org.example.ObserverDesignPattern.Stock_Observer.Observable.IphoneObservableImpl;
import org.example.ObserverDesignPattern.Stock_Observer.Observable.StocksObservable;
import org.example.ObserverDesignPattern.Stock_Observer.Observer.EmailAlertObserverImpl;
import org.example.ObserverDesignPattern.Stock_Observer.Observer.MobileAlertObserverImpl;
import org.example.ObserverDesignPattern.Stock_Observer.Observer.NotificationAlertObserver;

public class Store {
    public static  void main(String args[]){
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gamil.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz1@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("Piyush",iphoneStockObservable );

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);

    }
}
