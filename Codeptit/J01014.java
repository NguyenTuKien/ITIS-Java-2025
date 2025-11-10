import java.util.Scanner;
public class J01014 {
    public static long factorize(long n){
        long ans = 1;
        for (long i = 2; i <= Math.sqrt(n); ++i){
            while (n % i == 0){
                n /= i;
                ans = Math.max(ans, i);
            }
        }
        ans = Math.max(ans, n);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(factorize(n));
        }
    }
}
