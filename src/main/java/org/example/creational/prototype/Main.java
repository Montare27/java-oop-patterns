package org.example.creational.prototype;

public class Main {

    public static void main(String[] args) {

        // Create factory of products (factory is cloning chairs and tables)
        Factory factory = new Factory();

        // Create a table and some chairs
        System.out.println(factory.createProduct(Table.class).getName());
        System.out.println(factory.createProduct(Chair.class).getName());
        System.out.println(factory.createProduct(Chair.class).getName());
        System.out.println(factory.createProduct(Chair.class).getName());
    }
}
