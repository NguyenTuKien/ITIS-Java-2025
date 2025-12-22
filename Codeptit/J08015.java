import java.util.*;

public class J08015 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            int cnt = 0;
            Map<Long, Integer> freq = new TreeMap<>();
            for (int i = 0; i < n; ++i) {
                long num = sc.nextLong();
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
            for (Long key : freq.keySet()){
                long target = k - key;
                long countKey = freq.get(key);
                if (key == target) {
                    cnt += countKey * (countKey - 1) / 2;
                }
                else if (key < target) {
                    if(freq.containsKey(target)){
                        cnt += countKey * freq.get(target);
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
