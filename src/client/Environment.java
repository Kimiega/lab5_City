package client;

import cmd.ICommand;
import collection.CollectionManager;
import ioManager.IOManager;
import ioManager.IReadable;
import ioManager.IWritable;

import java.util.HashMap;

public class Environment {
    private CollectionManager collectionManager;
    private HashMap<String, ICommand> commandMap;
    private IReadable in;
    private IWritable out;
    private String path;
    private boolean isRunning;
    public Environment(CollectionManager collectionManager, HashMap<String, ICommand> commandMap,String path, IReadable in, IWritable out){
        this.collectionManager = collectionManager;
        this.commandMap = commandMap;
        this.path = path;
        this.in = in;
        this.out = out;
        isRunning = true;
    }

    public CollectionManager getCollectionManager() {
        return collectionManager;
    }

    public HashMap<String, ICommand> getCommandMap() {
        return commandMap;
    }

    public IReadable getIn(){
        return in;
    }

    public IWritable getOut(){
        return out;
    }
    public boolean getIsRunning(){
        return isRunning;
    }
    public void turnOff(){
        isRunning = false;
    }

    public String getPath() {
        return path;
    }
}
