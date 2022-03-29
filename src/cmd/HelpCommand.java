package cmd;

import collection.CollectionManager;

public class HelpCommand implements Command{

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String getDescribe() {

        return "help                    | Вывести справку по доступным командам";
    }

    @Override
    public void execute(CollectionManager collection) {
    }
}
