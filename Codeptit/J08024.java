import java.util.*;

public class J08024 {
    // Tính phần dư khi chia chuỗi số cho n
    public static boolean isDivisible(String s, int n) {
        int r = 0;
        for (char c : s.toCharArray()) {
            r = (r * 10 + (c - '0')) % n;
        }
        return r == 0;
    }

    public static String solve(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("9");

        while (!q.isEmpty()) {
            String cur = q.poll();
            if (isDivisible(cur, n)) return cur;
            q.add(cur + "0");
            q.add(cur + "9");
        }
        return "-1"; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
        sc.close();
    }
}
