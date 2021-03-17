import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class Config {
    private File load;
    private String prefs;
    private String name;
    private int password;

    public Config(File load) {
        this.load = load;
        prefs = read();
        parsePrefs();
    }

    private String read() {
        String returnable = "";
        try {
            FileReader reader = new FileReader(load);
            int ch = reader.read();
            while(ch != -1) {
                returnable += (char)(ch);
                ch = reader.read();
            }
        } catch (IOException e) {
            System.out.println("Fatal Error, User Configuration Not Loaded. Error: " + e.getMessage());
            System.exit(-1);
        }
        return returnable;
    }

    private void parsePrefs() {
        Scanner parse = new Scanner(prefs);
        parse = parse.useDelimiter("\n");
        name = parse.nextLine();
        password = parse.nextInt();
    }

    public String getName() {
        return name;
    }

    public int getPassword(){return password;}
}
