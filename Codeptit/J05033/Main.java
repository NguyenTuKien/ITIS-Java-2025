package J05033;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList <Time> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            Time x = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
            arr.add(x);
        }
        Collections.sort(arr);
        for (Time x : arr){
            x.getInfo();
        }
        sc.close();
    }
}