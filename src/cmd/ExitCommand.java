package cmd;

import collection.CollectionManager;

public class ExitCommand implements Command{

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public String getDescribe() {

        return "exit                    | Завершить программу (без сохранения в файл)";
    }

    @Override
    public void execute(CollectionManager collection) {
    }
}
