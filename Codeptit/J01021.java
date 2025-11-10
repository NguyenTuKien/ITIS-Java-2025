import java.util.Scanner;

public class J01021 {
    public long binMul(long a, long b){
        if(b == 0) return 0;
        long tmp = binMul(a, b / 2);
        tmp = (tmp + tmp) % 1000000007;
        if(b % 2 == 1) return (a + tmp) % 1000000007;
        return tmp;
    }
    public long binPow(long a, long b) {
        if (b == 0) return 1;
        long tmp = binPow(a, b / 2);
        tmp = binMul(tmp, tmp);
        if (b % 2 == 1) tmp = (a * tmp) % 1000000007;
        return tmp;
    }
    public static void main(String[] args) {
        long a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            a = sc.nextLong();
            b = sc.nextLong();
            if(a == 0 && b == 0) break;
            System.out.println(new J01021().binPow(a, b));
        }
    }
}
