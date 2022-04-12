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
    public String readln() {
        return scanner.nextLine();
    }

    @Override
    public String[] readline() {
        String s = scanner.nextLine();
        String[] sArr = s.split("\\s");
        if (sArr.length==1 && sArr[0]=="\\s")
            sArr = new String[0];
        return sArr;
    }

    @Override
    public boolean hasNextInt() {
        return scanner.hasNextInt();
    }

    @Override
    public boolean hasNextFloat() {
        return scanner.hasNextFloat();
    }
    public Float nextFloat(){
        Float o = scanner.nextFloat();
        scanner.nextLine();
        return o;
    }

    @Override
    public Long nextLong() {
        Long o = scanner.nextLong();
        scanner.nextLine();
        return o;
    }

    @Override
    public boolean hasNextLong() {
        return scanner.hasNextLong();
    }

    @Override
    public Integer nextInt() {
        Integer o = scanner.nextInt();
        scanner.nextLine();
        return o;
    }

}
