package cmd;

import collection.CollectionManager;

public class ShowCommand implements Command{

    @Override
    public String getName() {
        return "show";
    }

    @Override
    public String getDescribe() {

        return "show                    | Вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }

    @Override
    public void execute(CollectionManager collection) {
        System.out.println("help command");
    }
}
