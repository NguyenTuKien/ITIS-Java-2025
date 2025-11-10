import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;

public class J01017 {

    static Scanner cin = new Scanner(System.in);

    static void solve(){
        long n = cin.nextLong();
        ArrayList<Integer> cs = new ArrayList<>();
        while(n > 0){
            cs.add((int)(n % 10));
            n /= 10;
        }
        for(int i = 0; i < cs.size() - 1; ++i){
            if(abs(cs.get(i) - cs.get(i + 1)) != 1){
                System.out.println("NO\n");
                return;
            }
        }
        System.out.println("YES\n");
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