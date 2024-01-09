package org.example.ObserverDesignPattern.Stock_Observer.Observer;

import org.example.ObserverDesignPattern.Stock_Observer.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StocksObservable observable;
    public MobileAlertObserverImpl(String userName, StocksObservable observable){
        this.observable = observable;
        this.userName = userName;
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("msg sent to " + userName);
    }

    @Override
    public void update() {sendMsgOnMobile(userName,"Product is in stock hurry Up!");}
}
