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
    
    public GamingSessionBuilder isMultiplayer(String strategyType) {
        if(strategyType=="multi")
            this.isMultiplayer = true;
        else
        this.isMultiplayer = false;
        return this;
    }
    
    public GamingSession build() {
        if (isMultiplayer) {
            return new MultiPlayerSession();
        } else {
            return new SinglePlayerSession();
        }
    }
}
