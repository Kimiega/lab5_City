package cmd;

import client.Environment;
import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class ShowCommand implements ICommand {

    @Override
    public String getName() {
        return "show";
    }

    @Override
    public String getDescribe() {

        return "show                    | Вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }

    @Override
    public void execute(Environment env, String[] args) {
        env.getCollectionManager().show();
    }
    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new ShowCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
