package com.chiara.observer;

import com.chiara.Stock;
import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers;

    public Observable() {
        this.observers = new ArrayList<>();
    }

    public void suscribirse(Observer observer) {
        this.observers.add(observer);
    }
    public void desuscribirse(Observer observer) {
        this.observers.remove(observer);
    }
    public void notificar() {
        this.observers.forEach(observer -> {
            observer.update(this);
        });
    }
}
