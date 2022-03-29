package cmd;

import client.Environment;
import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public class RemoveAllByTimezoneCommand implements ICommand {

    @Override
    public String getName() {
        return "remove_all_by_timezone";
    }

    @Override
    public String getDescribe() {

        return "remove_all_by_timezone  | Удалить из коллекции все элементы, значение поля timezone которого эквивалентно заданному";
    }

    @Override
    public void execute(Environment env, String[] args) {
        int timezone = -13;
        if (args.length>1)
            try{
                timezone = Integer.parseInt(args[1]);
            }
        catch (Exception ex){
                env.getIOManager().writeln("Wrong arg");
                return;
        }
        if (timezone>13 || timezone<-13)
        {
            env.getIOManager().writeln("Wrong arg");
            return;
        }
        env.getCollectionManager().removeAllByTimezone(timezone);
    }
    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new RemoveAllByTimezoneCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
