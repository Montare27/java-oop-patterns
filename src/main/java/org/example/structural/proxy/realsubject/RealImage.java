package org.example.structural.proxy.realsubject;

public class RealImage implements Image {

    private String name;

    public RealImage(String name) {
        this.name = name;

        System.out.println("Loading image " + this.name + "...");
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying image " + this.name + "...");
    }
}
