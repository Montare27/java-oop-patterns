package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.afactory.MultiChatFactory;
import org.example.creational.abstractfactory.confactory.MessengerFactory;
import org.example.creational.abstractfactory.confactory.WhatsAppFactory;
import org.example.creational.abstractfactory.conproduct.MultiChat;

public class Main {

    public static void main(String[] args) {

        // Chat via Messenger
        MultiChatFactory messengerConnectionFactory = new MessengerFactory();

        MultiChat messengerMultiChat = new MultiChat(messengerConnectionFactory);
        messengerMultiChat.chat();

        // Chat via WhatsApp
        MultiChatFactory whatsAppConnectionFactory = new WhatsAppFactory();

        MultiChat whatsAppMultiChat = new MultiChat(whatsAppConnectionFactory);
        whatsAppMultiChat.chat();
    }
}
