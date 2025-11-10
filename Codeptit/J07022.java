import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.io.File;
import java.util.TreeSet;

public class J07022 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("DATA.in"))) {
            ArrayList<String> result = new ArrayList<>();
            while (sc.hasNext()) {
                String token = sc.next();
                try {
                    Integer.parseInt(token);
                } catch (NumberFormatException e) {
                    result.add(token);
                }
            }
            boolean first = true;
            result.sort(String::compareTo);
            for (String word : result) {
                System.out.print(word + " ");
            }

        } catch (FileNotFoundException e){}
    }
}
