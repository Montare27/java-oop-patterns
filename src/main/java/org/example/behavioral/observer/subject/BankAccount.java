package org.example.behavioral.observer.subject;

import org.example.behavioral.observer.observer.Observer;

import java.util.LinkedList;
import java.util.List;

public class BankAccount implements Subject {

    private List<Observer> observers;
    private double amount;

    public BankAccount() {
        this.observers = new LinkedList<>();
        this.amount = 0.0;
    }

    public void credit(double amount) {
        this.amount += amount;
        notif();
    }

    public void debit(double amount) {
        this.amount -= amount;
        notif();
    }

    public double getAmount() {
        return this.amount;
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notif() {
        for (Observer observer : this.observers)
            observer.update(this);
    }
}
