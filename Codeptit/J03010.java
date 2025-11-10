import java.util.HashMap;
import java.util.Scanner;

public class J03010 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (t-- > 0) {
            String line = cin.nextLine().toLowerCase().trim();
            String[] words = line.split("\\s+");
            StringBuilder name = new StringBuilder();
            name.append(words[words.length - 1]);
            for (int i = 0; i < words.length - 1; ++i)
                name.append(words[i].charAt(0));
            }
            if(!map.containsKey(name.toString())) {
                map.put(name.toString(), 1);
                System.out.printf("%s@ptit.edu.vn\n", name.toString());
            } else {
                map.put(name.toString(), map.get(name.toString()) + 1);
                System.out.printf("%s@ptit.edu.vn\n", name.toString() + map.get(name.toString()));
            }
        }
    }
}
