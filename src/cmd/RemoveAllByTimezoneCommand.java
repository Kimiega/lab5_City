package cmd;

import client.Environment;

import java.util.HashMap;

public class RemoveAllByTimezoneCommand implements ICommand {

    @Override
    public String getName() {
        return "remove_all_by_timezone";
    }

    @Override
    public String getDescription() {

        return "remove_all_by_timezone  | Удалить из коллекции все элементы, значение поля timezone которого эквивалентно заданному";
    }

    @Override
    public void execute(Environment env, String arg) {
        int timezone = -13;
        if (!arg.isEmpty()) {
            try {
                timezone = Integer.parseInt(arg);
            } catch (NumberFormatException ex) {
                env.getOut().writeln("Wrong arg");
                return;
            }
            if (timezone > 13 || timezone < -13) {
                env.getOut().writeln("Wrong arg");
                return;
            }
            env.getCollectionManager().removeAllByTimezone(timezone);
        }
        else {
            env.getOut().writeln("Arg is missing");
        }
    }
    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new RemoveAllByTimezoneCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
