package Business;

import Entities.*;

public class GameManager {

    public void addToStore(Game game) {
        System.out.println("-----------------------");
        System.out.println("Oyun mağazaya eklendi: " + game.getName());
    }

    public void deleteToStore(Game game) {
        System.out.println("-----------------------");
        System.out.println("Oyun mağazadan silindi: " + game.getName());
    }
}