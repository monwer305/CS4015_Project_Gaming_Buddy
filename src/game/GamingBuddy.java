package game;

import player.Player;

public class GamingBuddy implements GamingBuddyInterface {
    private static GamingBuddy instance;

    private GamingBuddy() {}

    public static GamingBuddy getInstance() {
        if(instance == null) {
            instance = new GamingBuddy();
        }
        return instance;
    }

    @Override
    public void connectPlayers(Player player1, Player player2) {
        System.out.println("Connecting players " + player1.getName() + " and " + player2.getName() + "...");
    }
}
