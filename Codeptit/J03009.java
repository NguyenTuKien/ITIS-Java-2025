import java.util.Scanner;
import java.util.TreeSet;

public class J03009 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while (t-- > 0) {
            String line = cin.nextLine();
            String[] words = line.split("\\s+");
            TreeSet<String> set = new TreeSet<>();
            for (String word : words) {
                set.add(word);
            }
            line = cin.nextLine();
            words = line.split("\\s+");
            for (String word : words) {
                if (set.contains(word)) {
                    set.remove(word);
                }
            }
            for (String word : set) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }
}
