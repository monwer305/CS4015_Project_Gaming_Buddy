import session.GameStrategy;
import session.GamingSession;
import session.MultiPlayerSession;
import session.SinglePlayerSession;

public class GamingSessionBuilder {
    private GameStrategy strategy;
    private boolean isMultiplayer;
    
    public static GamingSessionBuilder builder() {
        return new GamingSessionBuilder();
    }
    
    public GamingSessionBuilder withStrategy(GameStrategy strategy) {
        this.strategy = strategy;
        return this;
    }
    public GamingSessionBuilder setMultiplayer (boolean b) {
        this.isMultiplayer=b;
        return this;
    }
    
    public GamingSession build() {
        if (isMultiplayer) {
            return new MultiPlayerSession();
        } else {
            return new SinglePlayerSession();
        }
    }
    @Override
    public String toString(){
        if (isMultiplayer) {
            return "[startegy: "+this.strategy+", isMultiplayer: true";
        } else {
            return "[startegy: "+this.strategy+", isMultiplayer: false";
        }
    }
}
