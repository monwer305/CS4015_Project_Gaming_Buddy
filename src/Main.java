import java.util.Scanner;

import game.Command;
import game.CommandInvoker;
import game.GamingBuddyInterface;
import player.Player;
import session.GamingSession;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Facade facade = new Facade();
    
        System.out.print("Enter player 1 type (casual/competitive/professional): ");
        String player1Type = scanner.nextLine();
        System.out.print("Enter player 1 name: ");
        String player1Name = scanner.nextLine();
        Player player1 = facade.getPlayer(player1Type, player1Name);
        facade.addObserver(player1);
    
        System.out.print("Enter player 2 type (casual/competitive/professional): ");
        String player2Type = scanner.nextLine();
        System.out.print("Enter player 2 name: ");
        String player2Name = scanner.nextLine();
        Player player2 =  facade.getPlayer(player2Type, player2Name);
        facade.addObserver(player2);

        System.out.print("Include leaderboard? (y/n): ");
        boolean includeLeaderboard = scanner.nextLine().equalsIgnoreCase("y");
    
        System.out.print("Include chat? (y/n): ");
        boolean includeChat = scanner.nextLine().equalsIgnoreCase("y");
    
        GamingBuddyInterface gamingBuddy = facade.getGamingBuddy();
        if (includeLeaderboard) {
            gamingBuddy = facade.includeLeaderBoard(gamingBuddy);
        }
        if (includeChat) {
            gamingBuddy = facade.includeChat(gamingBuddy);
        }
    
        CommandInvoker invoker = facade.cInvoker();
        Command inviteCommand = facade.getInviteCommand(player1, player2);
        facade.setCommand(invoker, inviteCommand);
        facade.executeCommand(invoker);
    
        facade.connectPlayers(player1, player2, gamingBuddy);
    
        System.out.print("Enter session type (single/multi) : ");
        String sessionType = scanner.nextLine();
        GamingSession session = facade.getSession(sessionType);
        if (session != null) {
            Command startSessionCommand = facade.getStartSessionCommand(session);
            facade.setCommand(invoker,startSessionCommand);
            facade.executeCommand(invoker);
        } else {
            System.out.println("Invalid session type.");
        }
    
        scanner.close();
    }
    
}
