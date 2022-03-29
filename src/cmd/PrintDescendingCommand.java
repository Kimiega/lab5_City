package cmd;

import collection.CollectionManager;

public class PrintDescendingCommand implements Command{

    @Override
    public String getName() {
        return "print_descending";
    }

    @Override
    public String getDescribe() {

        return "print_descending        | Вывести элементы коллекции в порядке убывания";
    }

    @Override
    public void execute(CollectionManager collection) {
        System.out.println("help command");
    }
}
