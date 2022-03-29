package ioManager;
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
        System.out.print(s);
    }

    @Override
    public void writeln(String s) {
        System.out.println(s);
    }

    @Override
    public String read() {
        return scanner.next();
    }

    @Override
    public String[] readline() {
        String s = scanner.nextLine();
        String[] sArr = s.split("\\s");
        if (sArr.length==1 && sArr[0]=="")
            sArr = new String[0];
        return sArr;
    }

}
