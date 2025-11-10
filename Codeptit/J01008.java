import java.util.Scanner;
public class J01008 {
    public static void factorize(int n){
        for (int i = 2; i <= Math.sqrt(n); ++i){
            if(n % i == 0){
                int cnt = 0;
                while (n % i == 0){
                    cnt += 1;
                    n /= i;
                }
                System.out.printf(" %d(%d)", i, cnt);
            }
        }
        if(n > 1) System.out.printf(" %d(1)", n);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; ++i){
            int n = sc.nextInt();
            System.out.printf("Test %d:", i);
            factorize(n);
        }
    }
}
