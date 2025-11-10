import java.util.*;
public class J01006 {
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
            int n = sc.nextInt();
            System.out.println(fibo[n]);
        }
        sc.close();
    }
}
