package session;
import player.Player;

public class MultiPlayerStrategy implements GameStrategy {
    @Override
    public void execute(Player player1, Player player2) {
        System.out.println("Starting a multiplayer game between " + player1.getName() + " and " + player2.getName());
    }
}