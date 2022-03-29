package main;
import client.Client;
import client.Environment;
import cmd.*;
import collection.Climate;
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

        AddCommand.register(commandMap);
        AddIfMaxCommand.register(commandMap);
        AddIfMinCommand.register(commandMap);
        ClearCommand.register(commandMap);
        ExecuteScriptCommand.register(commandMap);
        ExitCommand.register(commandMap);
        HelpCommand.register(commandMap);
        InfoCommand.register(commandMap);
        PrintAscendingCommand.register(commandMap);
        PrintDescendingCommand.register(commandMap);
        RemoveAllByTimezoneCommand.register(commandMap);
        RemoveByIdCommand.register(commandMap);
        RemoveGreaterCommand.register(commandMap);
        SaveCommand.register(commandMap);
        ShowCommand.register(commandMap);
        UpdateIdCommand.register(commandMap);

        Environment env = new Environment(myCollection,commandMap, cons);

        Client client = new Client(env);
        //client.init();
        String[] s = env.getIOManager().readline();
        System.out.println(s.length);
        for (String s1 : s) {
            System.out.println("|"+s1+"|");
        }
        System.out.println(Climate.OCEANIC.name());
    }
}

//public class Main {
//    public static void main(String[] args) throws IOException {
//        String x = LocalFileManager.Read("D:\\hello.txt");
//        System.out.println(x);
//    }
//}
