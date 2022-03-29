package client;
public class Client {
    //private boolean isGui;
    //private String path;
    private Environment env;
    public Client(Environment env){
        this.env = env;
    }
    public void init() {
        while (env.getIsRunning()) {
            String[] s = env.getIOManager().readline();
            if (env.getCommandMap().containsKey(s[0])) {
                env.getCommandMap().get(s[0]).execute(env, s);
            }
            else {
                env.getIOManager().writeln("Command not found");
            }
        }
    }
}

