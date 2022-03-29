package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class RemoveAllByTimezoneCommand extends Command {

    private RemoveAllByTimezoneCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "remove_all_by_timezone";
    }

    @Override
    public String getDescribe() {

        return "remove_all_by_timezone  | Удалить из коллекции все элементы, значение поля timezone которого эквивалентно заданному";
    }

    @Override
    public void execute(IOManager ioManager) {
        System.out.println("help command");
    }
    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new RemoveAllByTimezoneCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
