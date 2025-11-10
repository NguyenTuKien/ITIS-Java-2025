import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; ++i) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            LinkedHashMap <Integer, Integer> map = new LinkedHashMap<>();
            for (int j = 0; j < n; ++j) {
                arr[j] = sc.nextInt();
                if (map.containsKey(arr[j])) {
                    map.put(arr[j], map.get(arr[j]) + 1);
                } else {
                    map.put(arr[j], 1);
                }
            }
            System.out.printf("Test %d:\n", i + 1);
            for (Integer x : map.keySet()) {
                System.out.printf("%d xuat hien %d lan\n", x, map.get(x));
            }
        }
    }
}
