import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n + 1);
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            int x = cin.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });
        for (int x : arr) System.out.print(x + " ");
    }
}
