package ioManager;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class IOFileManager implements IOManager{
    private String path;
    FileReader fr;
    BufferedOutputStream fw;
    public IOFileManager(String path){
        this.path = path;
    }

    @Override
    public String read() { //TODO my own ex try catch
        if (fw==null){
            if (fr==null) {
                try {
                    fr = new FileReader(path);
                }
                catch(FileNotFoundException ex){
                    System.out.println("File not Found");
                    return "";
                }
            }
            String word = "";
            try {
                int i = fr.read();
                while (i != -1 && i != 10) {
                    word += (char) i;
                    i = fr.read();
                }
                if (word == "")
                    return null;
                return word;
            }
            catch(IOException ex) {
                System.out.println("Ошибка записи в файл");
                return null;
            }
        }
        else
            return null;
    }

    @Override
    public String[] readline() {
        return new String[0];
    }

    @Override
    public void write(String s) {

    }

    @Override
    public void writeln(String s) {

    }

}
