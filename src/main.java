import java.io.File;

public class main {
    public static void main(String[] args) {
        Config f = new Config(new File("./Resources/Save"));
        System.out.print(f.getName());
        System.out.print(f.getPassword());
    }
}
