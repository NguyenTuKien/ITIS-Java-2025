import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine().toLowerCase().trim();
            String[] words = s.split("\\s+");
            StringBuilder firstname = new StringBuilder();
            StringBuilder lastname = new StringBuilder();
            for (String word : words) {
                if(lastname.length() == 0) lastname.append(word.toUpperCase());
                else {
                    firstname.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1))
                            .append(" ");
                }
            }
            System.out.printf("%s, %s\n", firstname.toString().trim(), lastname.toString());
        }
    }
}