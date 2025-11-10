import java.util.*;
public class J03006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine();
            boolean ok = true;
            for (int i = 0; i <= (s.length() / 2); ++i){
                if((s.charAt(i) - '0') % 2 != 0) ok = false;
                if(s.charAt(i) != s.charAt((s.length() - i - 1))) ok = false;
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
