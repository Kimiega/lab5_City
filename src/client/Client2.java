package client;

import cmd.Command;
import cmd.CommandManager;
import ioManager.ConsoleManager;

public class Client2 {
    //private boolean isGui;
    //private String path;
    //private StreamManager streamManager;
    private CommandManager cmdManager;
    private ConsoleManager cons;
    //private MessageManager messageManager;
    public Client2(Command... cmds){
        //this.isGui = isGui;
        //this.path = path;
        //streamManager = new StreamManager();
        this.cmdManager = new CommandManager();
        for (Command cmd : cmds) {
            cmdManager.putCommand(cmd);
        }
        cons = ConsoleManager.getInstance();
    }
    public void init() {
        while (true) {
            String s = cons.read();
            if (!cmdManager.isCmdExist(s)){
                cons.write("Команда не найдена");
            }
            else {
                cmdManager.execute(s);
            }
        }
    }


}
