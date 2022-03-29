package cmd;

import collection.CollectionManager;

public class RemoveByIdCommand implements Command{

    @Override
    public String getName() {
        return "remove_by_id";
    }

    @Override
    public String getDescribe() {

        return "remove_by_id            | Удалить элемент из коллекции по его id";
    }

    @Override
    public void execute(CollectionManager collection) {
        System.out.println("help command");
    }
}
