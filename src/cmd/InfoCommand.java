package cmd;

import client.Environment;
import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class InfoCommand implements ICommand {
    @Override
    public String getName() {
        return "info";
    }

    @Override
    public String getDescribe() {

        return "info                    | Вывести в стандартный поток вывода информацию о коллекции";
    }

    @Override
    public void execute(Environment env, String[] args) {
        env.getCollectionManager().info();
    }

    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new InfoCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
