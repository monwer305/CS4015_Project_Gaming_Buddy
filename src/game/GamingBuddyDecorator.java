package game;
import player.Player;

public abstract class GamingBuddyDecorator implements GamingBuddyInterface {
    protected GamingBuddyInterface buddy;

    public GamingBuddyDecorator(GamingBuddyInterface buddy) {
        this.buddy = buddy;
    }

    @Override
    public void connectPlayers(Player player1, Player player2) {
        buddy.connectPlayers(player1, player2);
    }
}
