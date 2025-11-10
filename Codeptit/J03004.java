import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine().toLowerCase().trim();
            String[] words = s.split("\\s+");
            StringBuilder sb = new StringBuilder();

            for (String word : words) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }

            System.out.println(sb.toString().trim());
        }
    }
}
