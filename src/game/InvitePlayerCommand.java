package game;
import player.Player;

public class InvitePlayerCommand implements Command {
    private Player inviter;
    private Player invitee;

    public InvitePlayerCommand(Player inviter, Player invitee) {
        this.inviter = inviter;
        this.invitee = invitee;
    }

    @Override
    public void execute() {
        System.out.println(this.inviter.getName() + " has invited " + this.invitee.getName() + " to play.");
    }
}
