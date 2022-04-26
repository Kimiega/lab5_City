package cmd;

import client.Environment;
import collection.City;
import ioManager.RequestElement;

import java.util.HashMap;

public class AddIfMinCommand implements ICommand {

    @Override
    public String getName() {
        return "add_if_min";
    }

    @Override
    public String getDescription() {

        return "add_if_max              | Добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции";
    }

    @Override
    public void execute(Environment env, String arg) {
        RequestElement reqEl = new RequestElement(env.getIn(), env.getOut(), !env.isScript());
        City o = reqEl.readElement();
        env.getCollectionManager().addIfMin(o);
    }

    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new AddIfMinCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
