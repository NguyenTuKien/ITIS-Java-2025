import java.util.Scanner;

public class J01012 {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int t = cin.nextInt();
        while (t-- > 0) {
            int n = cin.nextInt();
            if (n % 2 != 0) System.out.println("0");
            else {
                int cnt = 1;
                for (int i = 2; i <= Math.sqrt(n); ++i) {
                    if (n % i == 0) {
                        if(i % 2 == 0) ++cnt;
                        if(n / i % 2 == 0 & n / i != i) ++cnt;
                    }
                }
                System.out.println(cnt);
            }
        }
    }
}
