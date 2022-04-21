package cmd;

import client.Environment;

import java.util.HashMap;

public class RemoveByIdCommand implements ICommand {

    @Override
    public String getName() {
        return "remove_by_id";
    }

    @Override
    public String getDescription() {

        return "remove_by_id            | Удалить элемент из коллекции по его id";
    }

    @Override
    public void execute(Environment env, String[] args) {
        int id = 0;
        if (args.length>1) {
            try {
                id = Integer.parseInt(args[1]);
            } catch (Exception ex) {
                env.getOut().writeln("Wrong arg");
                return;
            }
            env.getCollectionManager().removeById(id);
        }
        else
            env.getOut().writeln("Arg is missing");
    }
    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new RemoveByIdCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
