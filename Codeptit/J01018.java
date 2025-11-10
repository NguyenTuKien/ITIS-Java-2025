import java.util.Scanner;
import java.lang.Math;
public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            boolean ok = true;
            long tmp1 = n / 10;
            long tmp2 = n % 10;
            long sum = tmp2;
            while (tmp1 > 0){
                long tmp3 = tmp1 % 10;
                sum += tmp3;
                if(Math.abs(tmp3 - tmp2) != 2) {
                    ok = false;
                    break;
                }
                tmp2 = tmp3;
                tmp1 /= 10;
            }
            if(sum % 10 != 0) ok = false;
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
