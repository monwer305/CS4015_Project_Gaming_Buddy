package game;

import player.Player;

public class ChatDecorator extends GamingBuddyDecorator {
    public ChatDecorator(GamingBuddyInterface buddy) {
        super(buddy);
    }

    public void startChat(Player player1, Player player2) {
        System.out.println("Starting chat between " + player1.getName() + " and " + player2.getName() + "...");
    }

    @Override
    public void connectPlayers(Player player1, Player player2) {
        super.connectPlayers(player1, player2);
        startChat(player1, player2);
    }
}
