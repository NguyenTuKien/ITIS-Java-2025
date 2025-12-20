import java.io.File;
import java.io.FileNotFoundException;
import java.text.CollationElementIterator;
import java.util.*;

public class J07011 {
    public static void main(String argv[]) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("VANBAN.in"));
        Map<String, Integer> freq = new HashMap<>();
        int n = cin.nextInt();
        cin.nextLine();
        while(n-- > 0){
            String line = cin.nextLine();
            line = line.toLowerCase().replaceAll("[^a-z0-9]", " ");
            String[] words = line.trim().split("\\s+");
            for (String word : words){
                if(!word.isEmpty()) {
                    freq.put(word, freq.getOrDefault(word, 0) + 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(!o1.getValue().equals(o2.getValue())){
                    return o2.getValue() - o1.getValue();
                }
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for (Map.Entry<String, Integer> word : list){
            System.out.println(word.getKey() + " " + word.getValue());
        }
    }
}
