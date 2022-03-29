package cmd;

import client.Environment;
import collection.City;
import collection.CollectionManager;
import ioManager.IOManager;
import ioManager.RequestElement;

import java.util.HashMap;

public class AddIfMaxCommand implements ICommand {

    @Override
    public String getName() {
        return "add_if_max";
    }

    @Override
    public String getDescribe() {
        return "add_if_max              | Добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции";
    }

    @Override
    public void execute(Environment env, String[] args) {
        City o = RequestElement.readElement(env.getIOManager());
        env.getCollectionManager().addIfMax(o);
    }

    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new AddIfMaxCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
