package client;

import cmd.ICommand;
import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class Environment {
    private CollectionManager collectionManager;
    private HashMap<String, ICommand> commandMap;
    private IOManager ioManager;
    private boolean isRunning;
    public Environment(CollectionManager collectionManager, HashMap<String, ICommand> commandMap, IOManager ioManager){
        this.collectionManager = collectionManager;
        this.commandMap = commandMap;
        this.ioManager = ioManager;
        isRunning = true;
    }

    public CollectionManager getCollectionManager() {
        return collectionManager;
    }

    public HashMap<String, ICommand> getCommandMap() {
        return commandMap;
    }

    public IOManager getIOManager() {
        return ioManager;
    }
    public boolean getIsRunning(){
        return isRunning;
    }
    public void turnOff(){
        isRunning = false;
    }
}
