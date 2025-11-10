import java.util.Scanner;

public class J03007 {
    public static boolean check(String s){
        int sum = 0;
        if(s.charAt(0) != '8'){}
        for (int i = 0; i < s.length(); ++i){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
            sum += Integer.parseInt(s.charAt(i) + "");
        }
        return sum % 10 == 0;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while (t-- > 0) {
            String s = cin.nextLine();
            if(check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
