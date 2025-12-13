import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);
        HashSet<BigInteger> set = new HashSet<>();
        while(cin.hasNext()){
            set.add(new BigInteger(cin.next()));
        }
        BigInteger sum = new BigInteger("0");
        BigInteger mul = new BigInteger("1");
        for (BigInteger i : set){
            sum = sum.add(i);
        }
    }
}
