import java.util.Scanner;

public class J02103 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        int tc = 1;
        while (t-- > 0){
            int n = cin.nextInt();
            int m = cin.nextInt();
            int[][] a = new int[n][m];
            int [][] a_t = new int[m][n];
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j){
                    a[i][j] = cin.nextInt();
                    a_t[j][i] = a[i][j];
                }
            }
            System.out.println("Test " + tc++ + ":");
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    int val = 0;
                    for (int k = 0; k < m; ++k) {
                        val += a[i][k] * a_t[k][j];
                    }
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }
}
