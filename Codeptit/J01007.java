import java.util.*;
public class J01007 {
    public static long[] fibo = new long[100];

    public static void init(){
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < 93; ++i){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            for (int i = 0; i < 93; ++i){
                if(fibo[i] == n) {
                    System.out.println("YES");
                    break;
                }
                else if(fibo[i] > n){
                    System.out.println("NO");
                    break;
                }
            }
        }
        sc.close();
    }
}
