package org.example.structural.decorator.concomponent;

import org.example.structural.decorator.component.Meal;

public class Steak implements Meal {

    private double price;

    public Steak(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void printMeal() {
        System.out.println("Steak: " + this.price);
    }
}
