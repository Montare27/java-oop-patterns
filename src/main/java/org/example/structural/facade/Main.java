package org.example.structural.facade;

import org.example.structural.facade.facade.GameFacade;

public class Main {

    public static void main(String[] args) {

        // Play complex game using simple interface (facade)
        GameFacade game = new GameFacade();
        game.doQuest();
    }
}
