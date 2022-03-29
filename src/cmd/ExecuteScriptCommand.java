package cmd;

import client.Environment;

import java.util.HashMap;

public class ExecuteScriptCommand implements ICommand {

    @Override
    public String getName() {
        return "execute_script";
    }

    @Override
    public String getDescribe() {

        return "execute_script          | Считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.";
    }

    @Override
    public void execute(Environment env, String[] args) {
        String path = null;
        if (args.length==1){
            env.getIOManager().writeln("Введите путь к файлу");
            path = env.getIOManager().read();
            }
        while (path==null || path==""){
            env.getIOManager().writeln("Путь не может быть пустым");
            env.getIOManager().read();
        }

    }

    public static void register(HashMap<String, ICommand> commandMap) {
        ICommand cmd = new ExecuteScriptCommand();
        commandMap.put(cmd.getName(), cmd);
    }
}
