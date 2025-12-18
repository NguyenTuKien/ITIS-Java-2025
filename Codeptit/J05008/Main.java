package J05008;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner cin = new  Scanner(System.in);
       int t = cin.nextInt();
       while (t-- > 0) {
           int n = cin.nextInt();
           Polygon p = new Polygon(n);
           p.addPoint(cin);
           System.out.printf("%.3f\n", p.getSquare());
       }
   } 
}
