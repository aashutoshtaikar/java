package app;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int observerIndex = observers.indexOf(o);
        System.out.println("observer " + (observerIndex + 1) + " deleted");
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIBMPrice(double ibmPrice){
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }
    public void setAAPLPrice(double aaplPrice){
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }
    public void setGOOGPrice(double googPrice){
        this.googPrice = googPrice;
        notifyObserver();
    }
}