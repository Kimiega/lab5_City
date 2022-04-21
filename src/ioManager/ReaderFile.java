package ioManager;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReaderFile implements IReadable{
    private Scanner scanner;


    public ReaderFile(String path) throws FileNotFoundException {
       this.scanner =  new Scanner(new BufferedReader(new FileReader(path)));
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
