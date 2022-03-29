package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class PrintAscendingCommand extends Command {

    private PrintAscendingCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "print_ascending";
    }

    @Override
    public String getDescribe() {

        return "print_ascending         | Вывести элементы коллекции в порядке возрастания";
    }

    @Override
    public void execute(IOManager ioManager) {
        System.out.println("help command");
    }
    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new PrintAscendingCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
