package ioManager;

public interface IReadable {
    String read();
    String readln();
    String[] readline();
    boolean hasNextInt();
    boolean hasNextFloat();
    boolean hasNextLong();
    Integer nextInt();
    Float nextFloat();
    Long nextLong();
}
