package org.example.behavioral.strategy.concretestrategy;

import org.example.behavioral.strategy.strategy.Strategy;

public class Wrench implements Strategy {

    @Override
    public void execute() {
        System.out.println("Using wrench.");
    }

}
