package cmd;

import collection.CollectionManager;

public class PrintAscendingCommand implements Command{

    @Override
    public String getName() {
        return "print_ascending";
    }

    @Override
    public String getDescribe() {

        return "print_ascending         | Вывести элементы коллекции в порядке возрастания";
    }

    @Override
    public void execute(CollectionManager collection) {
        System.out.println("help command");
    }
}
