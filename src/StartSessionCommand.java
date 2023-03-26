import game.Command;
import session.GamingSession;

public class StartSessionCommand implements Command {
    private GamingSession session;

    public StartSessionCommand(GamingSession session) {
        this.session = session;
    }

    @Override
    public void execute() {
        session.start();
    }
}
