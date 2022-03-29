package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class InfoCommand extends Command {

    private InfoCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "info";
    }

    @Override
    public String getDescribe() {

        return "info                    | Вывести в стандартный поток вывода информацию о коллекции";
    }

    @Override
    public void execute(IOManager ioManager) {
        super.collectionManager.info();
    }

    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new InfoCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
