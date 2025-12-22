import java.util.ArrayList;
import java.util.Scanner;

public class J08012 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; ++i) adj.add(new ArrayList<>());
        for (int i = 0; i < n - 1; ++i){
            int x = sc.nextInt();
            int y = sc.nextInt();
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        boolean ok = false;
        for (ArrayList <Integer> arr : adj){
            if(arr.size() == n - 1) {
                System.out.println("Yes");
                ok = true;
                break;
            }
        }
        if(!ok) System.out.println("No");
    }
}