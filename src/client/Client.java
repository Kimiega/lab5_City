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

            String s = env.getIn().readline();
            String cmd = "";
            String arg = "";

            String[] sArr = s.split("\\s");
            if (sArr.length>=2 && sArr[0]=="\\s")
                sArr = new String[0];


            if (env.getCommandMap().containsKey(sArr[0])) {
                env.getCommandMap().get(sArr[0]).execute(env, sArr);
            }
            else {
                env.getOut().writeln("Command not found");
            }
        }
    }
}

