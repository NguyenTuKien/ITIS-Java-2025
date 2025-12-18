import java.io.File;
import java.util.*;

public class J07004 {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer, Integer> map = new TreeMap<>();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for  (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
