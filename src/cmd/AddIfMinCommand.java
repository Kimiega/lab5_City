package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class AddIfMinCommand extends Command {

    private AddIfMinCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "add_if_min";
    }

    @Override
    public String getDescribe() {

        return "add_if_max              | Добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции";
    }

    @Override
    public void execute(IOManager ioManager) {
        System.out.println("help command");
    }

    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new AddIfMinCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
