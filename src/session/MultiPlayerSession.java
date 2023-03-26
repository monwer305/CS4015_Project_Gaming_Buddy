package session;
public class MultiPlayerSession extends GamingSession {
    public MultiPlayerSession() {
        super();
    }

    @Override
    public void start() {
        System.out.println("Starting multiplayer session...");
    }

    @Override
    public void setup() {
        System.out.println("Setting up multiplayer session...");
    }

    @Override
    public void play() {
        System.out.println("Playing multiplayer session...");
    }

    @Override
    public void cleanup() {
        System.out.println("Cleaning up multiplayer session...");
    }
}
