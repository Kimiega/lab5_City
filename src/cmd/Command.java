package cmd;

import collection.CollectionManager;

public interface Command {
    String getName();
    String getDescribe();
    void execute(CollectionManager collection);
}
