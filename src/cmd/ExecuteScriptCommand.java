package cmd;

import collection.CollectionManager;

public class ExecuteScriptCommand implements Command{

    @Override
    public String getName() {
        return "execute_script";
    }

    @Override
    public String getDescribe() {

        return "execute_script          | Считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.";
    }

    @Override
    public void execute(CollectionManager collection) {
        System.out.println("help command");
    }
}
