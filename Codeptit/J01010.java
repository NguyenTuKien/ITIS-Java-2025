import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J01010 {

    static Scanner cin = new Scanner(System.in);

    static void solve(){
        long n = cin.nextLong();
        List<Integer> l = new ArrayList<>();
        while(n > 0) {
            int d = (int) (n % 10);
            if(d != 8 && d != 9 && d != 1 && d != 0){
                System.out.println("INVALID");
                return;
            }
            if(d == 8 || d == 9) d = 0;
            l.add(d);
            n /= 10;
        }
        for(int i = l.size() - 1; i >= 0; --i) n = n * 10 + l.get(i);
        if(n == 0) System.out.println("INVALID");
        else System.out.println(n);
    }

    public static void main(String[] args){
        int t = 1;
        t = cin.nextInt();
        for(int i = 1; i <= t; ++i){
//            System.out.print("Test " + i + ": ");
            solve();
        }
    }

}