package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class AddIfMaxCommand extends Command {

    private AddIfMaxCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "add_if_max";
    }

    @Override
    public String getDescribe() {
        return "add_if_max              | Добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции";
    }

    @Override
    public void execute(IOManager ioManager) {
        System.out.println("help command");
    }

    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new AddIfMaxCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
