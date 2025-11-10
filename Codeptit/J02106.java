import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; ++i){
            int sum = 0;
            for (int j = 0; j < 3; ++j){
                sum += cin.nextInt();
            }
            if (sum > 1) ++cnt;
        }
        System.out.println(cnt);
    }
}
