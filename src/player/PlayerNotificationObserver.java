package player;
public class PlayerNotificationObserver implements PlayerObserver {
    private Player player;

    public PlayerNotificationObserver(Player player) {
        this.player = player;
    }

    @Override
    public void update(Player newPlayer) {
        if (newPlayer != player) {
            System.out.println("New player " + newPlayer.getName() + " has joined the game!");
        }
    }
}
