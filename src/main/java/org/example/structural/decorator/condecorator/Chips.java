package org.example.structural.decorator.condecorator;

import org.example.structural.decorator.component.Meal;
import org.example.structural.decorator.decorator.SideDish;

public class Chips extends SideDish {

    private double price;

    public Chips(Meal meal, double price) {
        super(meal);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.price;
    }

    @Override
    public void printMeal() {
        super.printMeal();
        System.out.println("Chips: " + this.price);
    }
}
