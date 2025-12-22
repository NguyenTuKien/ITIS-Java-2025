import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();

            for (char c : s.toCharArray()){
                if(c == '(' || c == '[' || c == '{')  st.push(c);
                else if(c == ')') {
                    if(!st.empty() && st.peek() == '(') st.pop();
                    else { st.push(c); break; }
                }
                else if(c == ']') {
                    if(!st.empty() && st.peek() == '[') st.pop();
                    else { st.push(c); break; }
                }
                else if(c == '}') {
                    if(!st.empty() && st.peek() == '{') st.pop();
                    else { st.push(c); break; }
                }
            }

            if(st.empty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}