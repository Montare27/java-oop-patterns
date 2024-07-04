package org.example.creational.abstractfactory.conproduct;

import org.example.creational.abstractfactory.aproduct.Connection;
import org.example.creational.abstractfactory.afactory.MultiChatFactory;
import org.example.creational.abstractfactory.aproduct.Skin;

public class MultiChat {

    private Connection connection;
    private Skin skin;

    public MultiChat(MultiChatFactory multiChatFactory) {
        this.connection = multiChatFactory.createConnection();
        this.skin = multiChatFactory.createSkin();
    }

    public void chat() {
        System.out.println("Creating chat...");
        this.skin.draw();

        System.out.println("Chatting...");
        this.connection.send("Hello");
        String response = this.connection.receive();
    }
}
