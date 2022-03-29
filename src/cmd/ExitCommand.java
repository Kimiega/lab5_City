package cmd;

import client.Environment;

import java.util.HashMap;

public class ExitCommand implements ICommand {


    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public String getDescribe() {

        return "exit                    | Завершить программу (без сохранения в файл)";
    }

    @Override
    public void execute(Environment env, String[] args) {
        env.getIOManager().writeln("Finish of working! Thanks for using!");
        env.turnOff();
    }
    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new ExitCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
