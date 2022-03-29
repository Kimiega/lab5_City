package cmd;

import collection.CollectionManager;

public class RemoveGreaterCommand implements Command{

    @Override
    public String getName() {
        return "remove_greater";
    }

    @Override
    public String getDescribe() {

        return "remove_greater          | Удалить из коллекции все элементы, превышающие заданный";
    }

    @Override
    public void execute(CollectionManager collection) {
        System.out.println("help command");
    }
}
