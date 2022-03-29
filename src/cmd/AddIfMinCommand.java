package cmd;

import collection.CollectionManager;

public class AddIfMinCommand implements Command{

    @Override
    public String getName() {
        return "add_if_min";
    }

    @Override
    public String getDescribe() {

        return "add_if_max              | Добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции";
    }

    @Override
    public void execute(CollectionManager collection) {
        System.out.println("help command");
    }
}
