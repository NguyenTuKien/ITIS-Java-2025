import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07001{
    public static void main(String[] args) {
        try{
            File input = new File("DANHSACH.in");
            Scanner sc = new Scanner(input);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException ignored) {}
    }
}