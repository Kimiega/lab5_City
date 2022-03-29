package cmd;

import collection.CollectionManager;
import ioManager.IOManager;

import java.util.HashMap;

public interface ICommand {
    String getName();
    String getDescribe();
    void execute(IOManager ioManager);
}
