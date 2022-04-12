package main;
import client.Client;
import client.Environment;
import cmd.*;
import collection.CollectionManager;
import ioManager.ConsoleManager;
import ioManager.IOManager;
import ioManager.IReadable;
import ioManager.IWritable;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
//TODO StreamAPI ?
//TODO make execute_script command
//TODO Unit tests
//TODO javadoc
//TODO fix IOFileManager
//TODO make UML diagram

public class Main{

    public static void main(String[] args){
        String path = "collection2.json";
        //start settings
        //console gui
        //offline online
        //path type
        // path
        /* for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if (arg == "-p"){
               if (i!=args.length){
                   path = arg;
               }
            }
        }*/
        IReadable in = ConsoleManager.getInstance();
        IWritable out = ConsoleManager.getInstance();
        CollectionManager myCollection = new CollectionManager(in,out);
        HashMap<String, ICommand> commandMap = new HashMap<String, ICommand>();

        AddCommand.register(commandMap);
        AddIfMaxCommand.register(commandMap);
        AddIfMinCommand.register(commandMap);
        ClearCommand.register(commandMap);
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
        LoadCommand.register(commandMap);
        if (new File(path).isFile()){
            myCollection.load(path);
        }
        else{
            try {
                new File(path).createNewFile();
            }
            catch (IOException ex){
                ex.printStackTrace();
                System.exit(1);
            }
        }
        Environment env = new Environment(myCollection,commandMap,path, in, out);
        Client client = new Client(env);
        client.init();

    }
}
