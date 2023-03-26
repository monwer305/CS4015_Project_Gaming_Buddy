package game;

public class LeaderboardDecorator extends GamingBuddyDecorator {
    public LeaderboardDecorator(GamingBuddyInterface buddy) {
        super(buddy);
    }

    public void showLeaderboard() {
        System.out.println("Displaying leaderboard...");
    }
}
