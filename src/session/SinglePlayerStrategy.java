package session;
import player.Player;

public class SinglePlayerStrategy implements GameStrategy {
    @Override
    public void execute(Player player1, Player player2) {
        System.out.println("Starting a single-player game for " + player1.getName());
    }
}
