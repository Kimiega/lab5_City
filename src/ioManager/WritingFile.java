package ioManager;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class WritingFile implements IWritable{
    File file;
    private BufferedOutputStream fw;

    public WritingFile(String path) throws FileNotFoundException {
        file = new File(path);
        FileOutputStream out = new FileOutputStream(path);
        fw = new BufferedOutputStream(out);
    }


    @Override
    public void write(String text){
        try {
            FileOutputStream out = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void writeln(String text) {
        write(text+"\n");
    }
}
