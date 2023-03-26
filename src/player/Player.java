package player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Player implements Iterable<Player> {
    private String name;
    private List<PlayerObserver> observers;
    private int score;
    private List<Player> friends;
    private PlayerType type;
    
    public Player(String name, PlayerType type) {
        this.name = name;
        this.type = type;
        this.observers = new ArrayList<>();
        this.score = 0;
        this.friends = new ArrayList<>();
    }
    
    public void addObserver(PlayerObserver observer) {
        this.observers.add(observer);
    }
    
    public void removeObserver(PlayerObserver observer) {
        this.observers.remove(observer);
    }
    
    public void notifyObservers() {
        for(PlayerObserver observer : this.observers) {
            observer.update(this);
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public void setScore(int score) {
        this.score = score;
        notifyObservers();
    }
    
    public void addFriend(Player friend) {
        this.friends.add(friend);
    }
    
    public void removeFriend(Player friend) {
        this.friends.remove(friend);
    }
    
    public Iterator<Player> iterator() {
        return this.friends.iterator();
    }
    
    public PlayerType getType() {
        return this.type;
    }
}
