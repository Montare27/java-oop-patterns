package org.example.creational.abstractfactory.confactory;

import org.example.creational.abstractfactory.aproduct.Connection;
import org.example.creational.abstractfactory.conproduct.MessengerConnection;
import org.example.creational.abstractfactory.conproduct.MessengerSkin;
import org.example.creational.abstractfactory.aproduct.Skin;
import org.example.creational.abstractfactory.afactory.MultiChatFactory;

public class MessengerFactory implements MultiChatFactory {

    @Override
    public Connection createConnection() {
        return new MessengerConnection();
    }

    @Override
    public Skin createSkin() {
        return new MessengerSkin();
    }
}
