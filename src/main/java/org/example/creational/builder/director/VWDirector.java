package org.example.creational.builder.director;

import org.example.creational.builder.builder.Builder;

public class VWDirector implements Director {

    @Override
    public void build(Builder builder) {
        builder.createChassis();
        builder.createEngine();
        builder.createBody();
    }
}
