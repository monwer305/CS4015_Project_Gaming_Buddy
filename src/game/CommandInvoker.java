package game;
public class CommandInvoker {
    private Command command;
    
    public void executeCommand(Command command) {
        this.command = command;
        this.command.execute();
    }
}
