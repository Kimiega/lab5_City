package ioManager;
import java.util.Scanner;
//import java.io.Console;

public class ConsoleManager implements IReadable,IWritable{
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
    public String readline() {
        return scanner.nextLine();
    }

    public Float readFloat(){
        if (scanner.hasNextFloat())
            return scanner.nextFloat();
        else
            scanner.next();
        return null;
    }

    @Override
    public Long readLong() {
        if (scanner.hasNextLong())
            return scanner.nextLong();
        else
            scanner.next();
        return null;
    }

    @Override
    public Integer readInt() {
        if (scanner.hasNextInt())
            return scanner.nextInt();
        else
            scanner.next();
        return null;
    }
}
