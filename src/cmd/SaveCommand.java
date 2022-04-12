package cmd;

import client.Environment;
import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class SaveCommand implements ICommand {

    @Override
    public String getName() {
        return "save";
    }

    @Override
    public String getDescription() {

        return "save                    | Сохранить коллекцию в файл";
    }

    @Override
    public void execute(Environment env, String[] args) {
        env.getCollectionManager().save();
    }
    public static void register( HashMap<String, ICommand> commandMap) {
        ICommand cmd = new SaveCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
