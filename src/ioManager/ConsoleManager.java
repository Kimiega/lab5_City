package ioManager;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
//import java.io.Console;

public class ConsoleManager implements IOManager{
    //private Console cons;
    private Scanner scanner;
    private static ConsoleManager instance;


    private ConsoleManager() {
        //cons = System.console();
        scanner = new Scanner(System.in);
    }
    public static ConsoleManager getInstance(){
        if (instance == null)
            instance = new ConsoleManager();

        return instance;
    }
    @Override
    public void write(String s){
        System.out.println(s);
    }

    @Override
    public String read() {
        return scanner.next();
    }

    @Override
    public void skipLine() {
        if (scanner.hasNextLine());
            scanner.nextLine();
    }
}
