package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class ShowCommand extends Command {

    private ShowCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "show";
    }

    @Override
    public String getDescribe() {

        return "show                    | Вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }

    @Override
    public void execute(IOManager ioManager) {
        System.out.println("help command");
    }
    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new ShowCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
