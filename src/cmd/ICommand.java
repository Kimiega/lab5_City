package cmd;

import client.Environment;

public interface ICommand {
    String getName();
    String getDescribe();
    void execute(Environment env, String[] args);
}
