package cmd;

import java.util.*;
//TODO А НАХУЯ МНЕ ЭТОТ КЛАСС
public class CommandManager {
    private HashMap<String,Command> CommandMap;
    public CommandManager(){
        CommandMap = new HashMap<String,Command>();
    }

    public void putCommand(Command cmd){
        CommandMap.put(cmd.getName(),cmd);
    }

    public void execute(String... cmdText){
        CommandMap.get(cmdText[0]).execute();
    }
    public boolean isCmdExist(String s){
        return CommandMap.containsKey(s);
    }

}
