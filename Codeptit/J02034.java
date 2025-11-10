import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int mx = 0;
        boolean[] mark = new boolean[1005];
        int n = cin.nextInt();
        for (int i = 0; i < n; ++i){
            int x = cin.nextInt();
            mark[x] = true;
            mx = Math.max(mx, x);
        }
        boolean found = true;
        for (int i = 1; i < mx; ++i){
            if(!mark[i]) {
                System.out.println(i);
                found = false;
            }
        }
        if(found) System.out.println("Excellent!");
    }
}
