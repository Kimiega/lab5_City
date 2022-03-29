package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class RemoveByIdCommand extends Command {

    private RemoveByIdCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "remove_by_id";
    }

    @Override
    public String getDescribe() {

        return "remove_by_id            | Удалить элемент из коллекции по его id";
    }

    @Override
    public void execute(IOManager ioManager) {
        System.out.println("help command");
    }
    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new RemoveByIdCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
