package cmd;

import collection.CollectionManager;

public class AddIfMaxCommand implements Command{

    @Override
    public String getName() {
        return "add_if_max";
    }

    @Override
    public String getDescribe() {
        return "add_if_max              | Добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции";
    }

    @Override
    public void execute(CollectionManager collection) {
        System.out.println("help command");
    }
}
