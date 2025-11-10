import java.util.*;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] mark = new boolean[1001]; 
        boolean[] used = new boolean[1001]; 
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            mark[x] = true;
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if (mark[x] && !used[x]) {
                arr.add(x);
                used[x] = true;
            }
        }
        Collections.sort(arr);
        for (Integer x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
