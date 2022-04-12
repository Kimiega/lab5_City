package cmd;

import client.Environment;
import collection.City;
import ioManager.RequestElement;

import java.util.HashMap;

public class AddCommand implements ICommand {


    @Override
    public String getName() {
        return "add";
    }

    @Override
    public String getDescription() {
        return "add                     | Добавить новый элемент в коллекцию";
    }

    @Override
    public void execute(Environment env, String[] args) {
        RequestElement reqEl = new RequestElement(env.getIn(),env.getOut(), true);
        City o = reqEl.readElement();
        env.getCollectionManager().add(o);
    }

    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new AddCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
