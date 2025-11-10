import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>(7);
        list.add(new ArrayList<>());
        for (int i = 1; i <= n; ++i){
            list.add(new ArrayList<>());
            for (int j = 1; j <= n; ++j){
                int x = sc.nextInt();
                if(x == 1){
                    list.get(i).add(j);
                }
            }
        }
        for (int i = 1; i <= n; ++i){
            System.out.printf("List(%d) = ", i);
            for (Integer j : list.get(i)){
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}
