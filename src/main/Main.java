package main;
import client.Client;
import cmd.*;
import collection.CollectionManager;
import ioManager.ConsoleManager;
import ioManager.IOManager;

import java.util.HashMap;

public class Main{

    public static void main(String[] args){
        //start settings
        //console gui
        //offline online
        //path type
        // path
        String path = "";
        /* for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if (arg == "-p"){
               if (i!=args.length){
                   path = arg;
               }
            }
        }*/
        IOManager cons = ConsoleManager.getInstance();
        CollectionManager myCollection = new CollectionManager(cons);
        HashMap<String, ICommand> commandMap = new HashMap<String, ICommand>();

        AddCommand.register(myCollection,commandMap);
        AddIfMaxCommand.register(myCollection,commandMap);
        AddIfMinCommand.register(myCollection,commandMap);
        ClearCommand.register(myCollection,commandMap);
        ExecuteScriptCommand.register(myCollection,commandMap);
        ExitCommand.register(myCollection,commandMap);
        HelpCommand.register(myCollection,commandMap);
        InfoCommand.register(myCollection,commandMap);
        PrintAscendingCommand.register(myCollection,commandMap);
        PrintDescendingCommand.register(myCollection,commandMap);
        RemoveAllByTimezoneCommand.register(myCollection,commandMap);
        RemoveByIdCommand.register(myCollection,commandMap);
        RemoveGreaterCommand.register(myCollection,commandMap);
        SaveCommand.register(myCollection,commandMap);
        ShowCommand.register(myCollection,commandMap);
        UpdateIdCommand.register(myCollection,commandMap);

        Client client = new Client(
                cons,
                commandMap
        );
        client.init();
    }
}

//public class Main {
//    public static void main(String[] args) throws IOException {
//        String x = LocalFileManager.Read("D:\\hello.txt");
//        System.out.println(x);
//    }
//}
