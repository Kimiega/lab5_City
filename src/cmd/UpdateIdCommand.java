package cmd;

import collection.CollectionManager;

public class UpdateIdCommand implements Command{

    @Override
    public String getName() {
        return "update_id";
    }

    @Override
    public String getDescribe() {

        return "update_id               | Обновить значение элемента коллекции, id которого равен заданному";
    }

    @Override
    public void execute(CollectionManager collection) {
        System.out.println("help command");
    }
}
