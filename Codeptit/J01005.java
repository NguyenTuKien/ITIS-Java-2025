import java.util.*;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            double h = sc.nextDouble();
            for (int i = 1; i < n; ++i){
                System.out.printf("%.06f ", h * Math.sqrt((double)i / n));
            }
            System.out.println();
        }
        sc.close();
    }
}
