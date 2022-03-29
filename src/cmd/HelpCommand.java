package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class HelpCommand extends Command {

    private HelpCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String getDescribe() {

        return "help                    | Вывести справку по доступным командам";
    }

    @Override
    public void execute(IOManager ioManager) {
    }
    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new HelpCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
