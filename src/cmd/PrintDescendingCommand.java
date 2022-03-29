package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class PrintDescendingCommand extends Command {

    private PrintDescendingCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "print_descending";
    }

    @Override
    public String getDescribe() {

        return "print_descending        | Вывести элементы коллекции в порядке убывания";
    }

    @Override
    public void execute(IOManager ioManager) {
        System.out.println("help command");
    }
    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new PrintDescendingCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
