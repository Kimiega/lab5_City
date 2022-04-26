package cmd;

import client.Environment;

import java.util.HashMap;

public class HelpCommand implements ICommand {

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String getDescription() {

        return "help                    | Вывести справку по доступным командам";
    }

    @Override
    public void execute(Environment env, String arg) {
        for (ICommand cmd : env.getCommandMap().values()){
            env.getOut().writeln(cmd.getDescription());
        }
    }
    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new HelpCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
