import game.ChatDecorator;
import game.Command;
import game.CommandInvoker;
import game.GamingBuddy;
import game.GamingBuddyInterface;
import game.InvitePlayerCommand;
import game.LeaderboardDecorator;
import player.Player;
import player.PlayerFactory;
import player.PlayerNotificationObserver;
import session.GamingSession;
import session.MultiPlayerStrategy;

public class Facade {
    public GamingBuddyInterface getGamingBuddy(){
        return GamingBuddy.getInstance();
    }
    public Player getPlayer(String player1Type, String player1Name){
        return PlayerFactory.createPlayer(player1Type, player1Name);
    }
    public void addObserver(Player player ){
        player.addObserver(new PlayerNotificationObserver(player));
    }
    public CommandInvoker cInvoker(){
        return new CommandInvoker();
    }
    public Command getInviteCommand(Player p1, Player p2){
        return new InvitePlayerCommand(p1, p2);
    }
    public void executeCommand(CommandInvoker cI){
        cI.executeCommand();
    }
    public void setCommand(CommandInvoker cI,Command c){
        cI.setCommand(c);
    }
    public GamingBuddyInterface includeLeaderBoard(GamingBuddyInterface g){
        return new LeaderboardDecorator(g);
    }
    public GamingBuddyInterface includeChat(GamingBuddyInterface g){
        return new ChatDecorator(g);
    }
    public Command getStartSessionCommand(GamingSession gs){
        return new StartSessionCommand(gs);
    }
    public void connectPlayers(Player p1, Player p2, GamingBuddyInterface gMI){
        gMI.connectPlayers(p1, p2);
    }
    public GamingSession getSession(String type){
        return GamingSessionBuilder.builder().isMultiplayer(type).withStrategy(new MultiPlayerStrategy()).build();
    }
}
