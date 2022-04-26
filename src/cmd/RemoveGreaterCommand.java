package cmd;

import client.Environment;
import collection.City;
import ioManager.RequestElement;

import java.util.HashMap;

public class RemoveGreaterCommand implements ICommand {

    @Override
    public String getName() {
        return "remove_greater";
    }

    @Override
    public String getDescription() {

        return "remove_greater          | Удалить из коллекции все элементы, превышающие заданный";
    }

    @Override
    public void execute(Environment env, String arg) {
        RequestElement reqEl = new RequestElement(env.getIn(), env.getOut(), !env.isScript());
        City o = reqEl.readElement();
        env.getCollectionManager().removeGreater(o);
    }
    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new RemoveGreaterCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
