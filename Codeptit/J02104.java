import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class J02104 {
    public static class Pair <T, U> {
        public T first;
        public U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        List<Pair> ls = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int x = cin.nextInt();
                if (x == 1 && i < j) {
                    ls.add(new Pair(Math.min(i, j), Math.max(i, j)));
                }
            }
        }
        for (Pair p : ls) {
            System.out.printf("(%d,%d)\n", p.first, p.second);
        }
    }
}
