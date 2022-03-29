package client;

import cmd.*;
import collection.CollectionManager;
import ioManager.ConsoleManager;

import java.text.CollationElementIterator;
import java.util.HashMap;

public class Client {
    //private boolean isGui;
    //private String path;
    private HashMap<String,Command> commandMap;
    private ConsoleManager cons;
    private CollectionManager collection;
    private boolean isRunning;
    public Client(CollectionManager collection, Command... cmds){
        this.collection = collection;
        commandMap = new HashMap<String,Command>();
        for (Command cmd : cmds) {
            commandMap.put(cmd.getName(),cmd);
        }
        cons = ConsoleManager.getInstance();
        isRunning = true;
    }
    public void init() {
        while (isRunning) {
            String s = cons.read();

            switch (s) {
                case "help":
                    for (Command cmd : commandMap.values()) {
                        cons.write(cmd.getDescribe());
                    }
                    break;
                case "exit":
                    isRunning = false;
                    break;
                default:
                    if (commandMap.containsKey(s)) {
                        commandMap.get(s).execute(collection);
                    }
                    else {
                        cons.write("Команда не найдена");
                    }
            }
        }
    }
}

