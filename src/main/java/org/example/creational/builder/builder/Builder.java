package org.example.creational.builder.builder;

import org.example.creational.builder.product.Car;

public interface Builder {

    void createChassis();

    void createEngine();

    void createBody();

    Car getCar();
}
