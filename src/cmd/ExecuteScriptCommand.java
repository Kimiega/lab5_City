package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class ExecuteScriptCommand extends Command {

    private ExecuteScriptCommand(CollectionManager collectionManager) {
        super(collectionManager);
    }

    @Override
    public String getName() {
        return "execute_script";
    }

    @Override
    public String getDescribe() {

        return "execute_script          | Считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.";
    }

    @Override
    public void execute(IOManager ioManager) {
        System.out.println("help command");
    }

    public static void register(CollectionManager collectionManager, HashMap<String, ICommand> commandMap) {
        ICommand cmd = new ExecuteScriptCommand(collectionManager);
        commandMap.put(cmd.getName(), cmd);
    }
}
