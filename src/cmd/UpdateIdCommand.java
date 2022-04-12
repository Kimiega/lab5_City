package cmd;

import client.Environment;
import collection.City;
import collection.CollectionManager;
import ioManager.IOManager;
import ioManager.RequestElement;

import java.util.HashMap;

public class UpdateIdCommand implements ICommand {

    @Override
    public String getName() {
        return "update_id";
    }

    @Override
    public String getDescription() {

        return "update_id               | Обновить значение элемента коллекции, id которого равен заданному";
    }

    @Override
    public void execute(Environment env, String[] args) {
        int id = 0;
        if (args.length>1)
            try{
                id = Integer.parseInt(args[1]);
            }
            catch (Exception ex){
                env.getOut().writeln("Wrong arg");
                return;
            }
        RequestElement reqEl = new RequestElement(env.getIn(), env.getOut(), true);
        City o = reqEl.readElement();
        env.getCollectionManager().updateById(id,o);
    }
    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new UpdateIdCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
