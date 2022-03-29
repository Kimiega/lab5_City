package ioManager;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IOManager{
    String read();
    String[] readline();
    void write(String s);
    void writeln(String s);
}
