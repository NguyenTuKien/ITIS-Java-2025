import java.util.*;

public class J08026 {
    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int src = sc.nextInt();
            int tar = sc.nextInt();
            Map<Integer, Integer> mark = new HashMap<>();
            Queue<Integer> q = new LinkedList<>();
            mark.put(src, 0);
            q.add(src);
            while(q.peek() != tar){
                int cur = q.peek();
                q.poll();
                if(!mark.containsKey(cur - 1) && cur - 1 > 0) {
                    q.add(cur - 1);
                    mark.put(cur - 1, mark.get(cur) + 1);
                }
                if(!mark.containsKey(cur * 2) && cur * 2 < 100000) {
                    q.add(cur * 2);
                    mark.put(cur * 2, mark.get(cur) + 1);
                }
            }
            System.out.println(mark.get(tar));
        }
    }
}
