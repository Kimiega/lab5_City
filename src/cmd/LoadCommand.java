package cmd;

import client.Environment;

import java.util.HashMap;

public class LoadCommand implements ICommand {

    @Override
    public String getName() {
        return "load";
    }

    @Override
    public String getDescription() {

        return "load                    | Загрузить коллекцию из файла";
    }

    @Override
    public void execute(Environment env, String[] args) {
        env.getCollectionManager().load(env.getPath());
    }
    public static void register( HashMap<String, ICommand> commandMap) {
        ICommand cmd = new LoadCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
