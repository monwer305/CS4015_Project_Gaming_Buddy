package session;
public abstract class GamingSession {
    public void start() {
        setup();
        play();
        cleanup();
    }
    
    protected abstract void setup();
    
    protected abstract void play();
    
    protected abstract void cleanup();
}
