package session;
public class SinglePlayerSession extends GamingSession {
    public SinglePlayerSession() {
        super();
    }

    @Override
    public void start() {
        System.out.println("Starting single player session...");
    }

    @Override
    public void setup() {
        System.out.println("Setting up single player session...");
    }

    @Override
    public void play() {
        System.out.println("Playing single player session...");
    }

    @Override
    public void cleanup() {
        System.out.println("Cleaning up single player session...");
    }
}
