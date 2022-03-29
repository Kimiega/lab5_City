package ioManager;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IOManager{
    String read() throws IOException;
    void write(String s);
    void skipLine() throws IOException;
}
