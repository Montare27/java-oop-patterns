package org.example.creational.abstractfactory.conproduct;

import org.example.creational.abstractfactory.aproduct.Skin;

public class MessengerSkin implements Skin {

    @Override
    public void draw() {
        System.out.println("Draw blue skin for Messenger.");
    }
}
