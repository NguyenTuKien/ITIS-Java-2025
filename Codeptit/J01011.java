import java.util.Scanner;

public class J01011 {
    static Scanner cin = new Scanner(System.in);

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        int t = cin.nextInt();
        while (t-- > 0) {
            long a = cin.nextLong();
            long b = cin.nextLong();
            System.out.printf("%d %d\n", lcm(Math.max(a, b), Math.min(a, b)), gcd(Math.max(a, b), Math.min(a, b)));
        }
    }
}
