package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class SaveCommand extends Command {

    private SaveCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "save";
    }

    @Override
    public String getDescribe() {

        return "save                    | Сохранить коллекцию в файл";
    }

    @Override
    public void execute(IOManager ioManager) {
        System.out.println("help command");
    }
    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new SaveCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
