package cmd;

import collection.CollectionManager;

public class RemoveAllByTimezoneCommand implements Command{

    @Override
    public String getName() {
        return "remove_all_by_timezone";
    }

    @Override
    public String getDescribe() {

        return "remove_all_by_timezone  | Удалить из коллекции все элементы, значение поля timezone которого эквивалентно заданному";
    }

    @Override
    public void execute(CollectionManager collection) {
        System.out.println("help command");
    }
}
