package main;
import client.Client;
import cmd.*;
import collection.CollectionManager;

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
        CollectionManager myCollection = new CollectionManager();
        Client client = new Client(
                myCollection,
                new AddCommand(),
                new AddIfMinCommand(),
                new AddIfMaxCommand(),
                new ClearCommand(),
                new ExecuteScriptCommand(),
                new ExitCommand(),
                new HelpCommand(),
                new InfoCommand(),
                new PrintAscendingCommand(),
                new PrintDescendingCommand(),
                new RemoveAllByTimezoneCommand(),
                new RemoveByIdCommand(),
                new RemoveGreaterCommand(),
                new SaveCommand(),
                new ShowCommand(),
                new UpdateIdCommand()
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
