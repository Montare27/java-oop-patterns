package org.example.creational.builder;

import org.example.creational.builder.builder.Builder;
import org.example.creational.builder.conbuilder.GolfBuilder;
import org.example.creational.builder.conbuilder.PassatBuilder;
import org.example.creational.builder.director.Director;
import org.example.creational.builder.director.VWDirector;

public class Main {

    public static void main(String[] args) {

        // Create VW factory
        Director vw = new VWDirector();

        // Create VW Golf
        Builder golfBuilder = new GolfBuilder();
        vw.build(golfBuilder);
        System.out.println(golfBuilder.getCar());

        // Create VW Passat
        Builder passatBuilder = new PassatBuilder();
        vw.build(passatBuilder);
        System.out.println(passatBuilder.getCar());
    }
}
