package org.example.creational.abstractfactory.conproduct;

import org.example.creational.abstractfactory.aproduct.Connection;

public class WhatsAppConnection implements Connection {

    @Override
    public void send(String message) {
        System.out.println("Send message via WhatsApp...");
    }

    @Override
    public String receive() {
        System.out.println("Receive message from WhatsApp...");
        return null;
    }
}
