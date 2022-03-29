package cmd;

import client.Environment;
import collection.CollectionManager;

import java.util.HashMap;

public class HelpCommand implements ICommand {

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String getDescribe() {

        return "help                    | Вывести справку по доступным командам";
    }

    @Override
    public void execute(Environment env, String[] args) {
        for (ICommand cmd : env.getCommandMap().values()){
            env.getIOManager().writeln(cmd.getDescribe());
        }
    }
    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new HelpCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
