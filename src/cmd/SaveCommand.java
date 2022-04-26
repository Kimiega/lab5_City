package cmd;

import client.Environment;

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
    public void execute(Environment env, String arg) {
        env.getCollectionManager().save(env.getPath());
    }
    public static void register( HashMap<String, ICommand> commandMap) {
        ICommand cmd = new SaveCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
