package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class UpdateIdCommand extends Command {

    private UpdateIdCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "update_id";
    }

    @Override
    public String getDescribe() {

        return "update_id               | Обновить значение элемента коллекции, id которого равен заданному";
    }

    @Override
    public void execute(IOManager ioManager) {
        System.out.println("help command");
    }
    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new UpdateIdCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
