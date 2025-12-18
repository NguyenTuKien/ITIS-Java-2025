package basic;
import java.io.*;
import java.util.*;

public class J03020 {
    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        Map<String, Integer> count = new LinkedHashMap<>();
        int maxLen = 0;

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            for (String s : line.split("\\s+")) {
                String w = s.replaceAll("[^A-Za-z0-9]", "");
                if (!w.isEmpty() && isPalindrome(w)) {
                    count.put(w, count.getOrDefault(w, 0) + 1);
                    if (w.length() > maxLen) maxLen = w.length();
                }
            }
        }

        for (Map.Entry<String, Integer> e : count.entrySet()) {
            if (e.getKey().length() == maxLen) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
    }
}