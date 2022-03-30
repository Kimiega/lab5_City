package ioManager;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

//TODO
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
                if (word.equals(""))
                    return null;
                return word;
            }
            catch(IOException ex) {
                System.out.println("Ошибка чтения файла");
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
    public void write(String text) {
        if (fr==null) {
            try (FileOutputStream out = new FileOutputStream("collection.json");
                 BufferedOutputStream bos = new BufferedOutputStream(out)) {
                byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
                bos.write(buffer, 0, buffer.length);
            } catch (IOException ex) {

                System.out.println("Ошибка записи в файл");
            }
        }
    }

    @Override
    public void writeln(String s) {

    }
    public String readAll(){
        byte[] data;
        try {
            data = Files.readAllBytes(Paths.get("collection.json"));

        } catch (IOException ex) {
            System.out.format("I/O error");
            return "";
        }
        return new String(data,StandardCharsets.UTF_8);
    }

}
