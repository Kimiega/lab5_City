package cmd;

import client.Environment;

import java.util.HashMap;

public class PrintAscendingCommand implements ICommand {

    @Override
    public String getName() {
        return "print_ascending";
    }

    @Override
    public String getDescription() {

        return "print_ascending         | Вывести элементы коллекции в порядке возрастания";
    }

    @Override
    public void execute(Environment env, String arg) {
        env.getCollectionManager().printAscending();
    }
    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new PrintAscendingCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
