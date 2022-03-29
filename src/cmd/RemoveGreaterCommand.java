package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class RemoveGreaterCommand extends Command {

    private RemoveGreaterCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "remove_greater";
    }

    @Override
    public String getDescribe() {

        return "remove_greater          | Удалить из коллекции все элементы, превышающие заданный";
    }

    @Override
    public void execute(IOManager ioManager) {
        System.out.println("help command");
    }
    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new RemoveGreaterCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
