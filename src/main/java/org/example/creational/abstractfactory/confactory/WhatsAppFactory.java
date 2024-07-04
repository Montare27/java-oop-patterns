package org.example.creational.abstractfactory.confactory;

import org.example.creational.abstractfactory.aproduct.Connection;
import org.example.creational.abstractfactory.aproduct.Skin;
import org.example.creational.abstractfactory.conproduct.WhatsAppConnection;
import org.example.creational.abstractfactory.conproduct.WhatsAppSkin;
import org.example.creational.abstractfactory.afactory.MultiChatFactory;

public class WhatsAppFactory implements MultiChatFactory {

    @Override
    public Connection createConnection() {
        return new WhatsAppConnection();
    }

    @Override
    public Skin createSkin() {
        return new WhatsAppSkin();
    }
}
