package cmd;

import client.Environment;

import java.util.HashMap;

public class ClearCommand implements ICommand {


    @Override
    public String getName() {
        return "clear";
    }

    @Override
    public String getDescription() {

        return "clear                   | Очистить коллекцию";
    }

    @Override
    public void execute(Environment env, String arg) {
        env.getCollectionManager().clear();
    }

    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new ClearCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
