package cmd;

import collection.City;
import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class AddCommand extends Command {

    private AddCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "add";
    }

    @Override
    public String getDescribe() {
        return "add                     | Добавить новый элемент в коллекцию";
    }

    @Override
    public void execute(IOManager ioManager) {
        //TODO request to get an object
        City o;
        super.collectionManager.add(o);
    }

    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new AddCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
