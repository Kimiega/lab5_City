package cmd;

import client.Environment;

public interface ICommand {
    String getName();
    String getDescription();
    void execute(Environment env, String arg);
}
