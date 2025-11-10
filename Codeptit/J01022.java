import java.util.Scanner;

public class J01022 {
    public static long[] fibo = new long[100];
    public static void init(){
        fibo[1] = 1;
        fibo[2] = 1;
        for (int i = 2; i < 94; ++i){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            while (n > 2){
                if(k <= fibo[n - 2]){
                    n = n - 2;
                } else {
                    k -= fibo[n - 2];
                    n = n - 1;
                }
            }
            if(n == 1) System.out.println(0);
            else System.out.println(1);
        }
    }
}
