package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class ClearCommand extends Command {

    private ClearCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "clear";
    }

    @Override
    public String getDescribe() {

        return "clear                   | Очистить коллекцию";
    }

    @Override
    public void execute(IOManager ioManager) {

    }

    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new ClearCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
