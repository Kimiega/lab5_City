package cmd;

import collection.CollectionManager;

public class InfoCommand implements Command{

    @Override
    public String getName() {
        return "info";
    }

    @Override
    public String getDescribe() {

        return "info                    | Вывести в стандартный поток вывода информацию о коллекции";
    }

    @Override
    public void execute(CollectionManager collection) {
        System.out.println("info command");
    }
}
