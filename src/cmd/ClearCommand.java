package cmd;

import collection.CollectionManager;

public class ClearCommand implements Command{

    @Override
    public String getName() {
        return "clear";
    }

    @Override
    public String getDescribe() {

        return "clear                   | Очистить коллекцию";
    }

    @Override
    public void execute(CollectionManager collection) {

    }
}
