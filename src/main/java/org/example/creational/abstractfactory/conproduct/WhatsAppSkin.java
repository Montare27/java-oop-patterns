package org.example.creational.abstractfactory.conproduct;

import org.example.creational.abstractfactory.aproduct.Skin;

public class WhatsAppSkin implements Skin {

    @Override
    public void draw() {
        System.out.println("Draw green skin for WhatsApp.");
    }
}
