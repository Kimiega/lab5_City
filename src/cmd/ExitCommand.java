package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class ExitCommand extends Command {

    private ExitCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public String getDescribe() {

        return "exit                    | Завершить программу (без сохранения в файл)";
    }

    @Override
    public void execute(IOManager ioManager) {
    }
    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new ExitCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
