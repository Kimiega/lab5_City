package client;

import cmd.*;
import ioManager.IOManager;

import java.io.IOException;
import java.util.HashMap;

public class Client {
    //private boolean isGui;
    //private String path;
    private HashMap<String, ICommand> commandMap;
    private IOManager ioManager;
    private boolean isRunning;
    public Client(IOManager ioManager, HashMap<String, ICommand> commandMap){
        this.commandMap = commandMap;
        this.ioManager = ioManager;
        isRunning = true;
    }
    public void init() {
        while (isRunning) {
            String s = "";
            try {
                s = ioManager.read();//TODO own ex
            }
            catch (IOException ex){
                s  = "";
            }
            switch (s) {
                case "help":
                    for (ICommand cmd : commandMap.values()) {
                        ioManager.write(cmd.getDescribe());
                    }
                    break;
                case "exit":
                    isRunning = false;
                    break;
                default:
                    if (commandMap.containsKey(s)) {
                        commandMap.get(s).execute(ioManager);
                    }
                    else {
                        ioManager.write("Команда не найдена");
                    }
            }
        }
    }
}

