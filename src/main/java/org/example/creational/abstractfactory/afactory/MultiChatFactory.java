package org.example.creational.abstractfactory.afactory;

import org.example.creational.abstractfactory.aproduct.Connection;
import org.example.creational.abstractfactory.aproduct.Skin;

public interface MultiChatFactory {

    Connection createConnection();
    Skin createSkin();
}
