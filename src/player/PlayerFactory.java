package player;

public class PlayerFactory {
    public static Player createPlayer(String type, String name) {
        if ("casual".equalsIgnoreCase(type)) {
            return new CasualPlayer(name);
        } else if ("competitive".equalsIgnoreCase(type)) {
            return new CompetitivePlayer(name);
        } else if ("professional".equalsIgnoreCase(type)) {
            return new ProfessionalPlayer(name);
        } else {
            return null;
        }
    }
}
