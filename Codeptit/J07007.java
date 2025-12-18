import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J07007 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> set = new TreeSet<>();
        while (sc.hasNext()) {
            String word = sc.next().toLowerCase();
            set.add(word);
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}