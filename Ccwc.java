import java.io.FileReader;

public class Ccwc {
    public static void main(String[] args) throws Exception {
        int n = args.length;

        if (n == 0){
            System.out.println("Please enter arguments");
            return;
        }
        if (n == 1){
            FileHandler f = new FileHandler(args[0]);
            System.out.println(f.size() + " " + f.lines() + " " + f.words() + " " +args[0]);
            return;
        }
        FileHandler f = new FileHandler(args[1]);
        switch (args[0]) {
            case "-w" -> System.out.println(f.words() + " " + args[1]);
            case "-l" -> System.out.println(f.lines() + " " + args[1]);
            case "-c" -> System.out.println(f.size() + " " + args[1]);
            default -> System.out.println("unexpected error");
        }
    }
}
