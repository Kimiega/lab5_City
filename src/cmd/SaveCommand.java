package cmd;

import collection.CollectionManager;

public class SaveCommand implements Command{

    @Override
    public String getName() {
        return "save";
    }

    @Override
    public String getDescribe() {

        return "save                    | Сохранить коллекцию в файл";
    }

    @Override
    public void execute(CollectionManager collection) {
        System.out.println("help command");
    }
}
