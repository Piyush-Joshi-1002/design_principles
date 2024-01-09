package org.example.ObserverDesignPattern.Stock_Observer.Observer;

import org.example.ObserverDesignPattern.Stock_Observer.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailID;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailID, StocksObservable observable){
        this.observable = observable;
        this.emailID = emailID;
    }

    @Override
    public void update() {
        sendMail(emailID,"product is in stock hurry up!");
    }

    private void sendMail(String emailID, String msg){
        System.out.println("mail sent to :" + emailID);
    }
}
