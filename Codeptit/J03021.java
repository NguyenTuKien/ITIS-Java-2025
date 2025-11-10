import java.util.Scanner;

public class J03021 {
    public static char change(char c){
        if(c == 'A' | c == 'B' | c == 'C') return '2';
        else if(c == 'a' | c == 'b' | c == 'c') return '2';
        else if(c == 'D' | c == 'E' | c == 'F') return '3';
        else if(c == 'd' | c == 'e' | c == 'f') return '3';
        else if(c == 'G' | c == 'H' | c == 'I') return '4';
        else if(c == 'g' | c == 'h' | c == 'i') return '4';
        else if(c == 'J' | c == 'K' | c == 'L') return '5';
        else if(c == 'j' | c == 'k' | c == 'l') return '5';
        else if(c == 'M' | c == 'N' | c == 'O') return '6';
        else if(c == 'm' | c == 'n' | c == 'o') return '6';
        else if(c == 'P' | c == 'Q' | c == 'R' | c == 'S') return '7';
        else if(c == 'p' | c == 'q' | c == 'r' | c == 's') return '7';
        else if(c == 'T' | c == 'U' | c == 'V') return '8';
        else if(c == 't' | c == 'u' | c == 'v') return '8';
        else if(c == 'W' | c == 'X' | c == 'Y' | c == 'Z') return '9';
        else if(c == 'w' | c == 'x' | c == 'y' | c == 'z') return '9';
        else return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String ans = "";
            boolean ok = true;
            for (int i = 0; i < s.length(); ++i) {
                ans += change(s.charAt(i));
            }
            for (int i = 0; i <= ans.length() / 2; ++i) {
                if(ans.charAt(i) != ans.charAt(ans.length() - i - 1)) {
                    ok = false;
                    break;
                }
            }
            if(ok) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
