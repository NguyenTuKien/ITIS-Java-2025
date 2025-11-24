import java.io.File;
import java.util.Scanner;

public class J07002 {
    public static void main(String[] args) throws Exception{
        Scanner cin = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (cin.hasNext()){
            try {
                int n = Integer.parseInt(cin.next());
                sum += n;
            } catch (Exception e) {}
        }
        System.out.println(sum);
    }
}
