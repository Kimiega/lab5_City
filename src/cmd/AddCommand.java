package cmd;

import collection.City;
import collection.CollectionManager;

public class AddCommand implements Command{

    @Override
    public String getName() {
        return "add";
    }

    @Override
    public String getDescribe() {
        return "add                     | Добавить новый элемент в коллекцию";
    }

    @Override
    public void execute(CollectionManager collection) {
        //TODO request to get an object
        City o;
        collection.add(o);
    }
}
