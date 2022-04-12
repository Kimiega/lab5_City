package cmd;

import client.Environment;
import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class PrintDescendingCommand implements ICommand {

    @Override
    public String getName() {
        return "print_descending";
    }

    @Override
    public String getDescription() {

        return "print_descending        | Вывести элементы коллекции в порядке убывания";
    }

    @Override
    public void execute(Environment env, String[] args) {
        env.getCollectionManager().printDescending();
    }
    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new PrintDescendingCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
