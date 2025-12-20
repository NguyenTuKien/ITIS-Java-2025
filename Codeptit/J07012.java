import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class J07012 {
    public static void main(String argv[]) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        Map<String, Integer> freq = new HashMap<>();
        List<String> list = (ArrayList<String>) ois.readObject();
        for (String line : list){
            String s = line.toLowerCase().replaceAll("[^a-z0-9]", " ");
            String[] words = s.toLowerCase().split("\\s+");
            for (String word : words){
                if(!word.isEmpty()) {
                    freq.put(word, freq.getOrDefault(word, 0) + 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> words = new ArrayList<>(freq.entrySet());
        Collections.sort(words, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(!o2.getValue().equals(o1.getValue())) return o2.getValue() - o1.getValue();
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for (Map.Entry<String, Integer> word : words){
            System.out.println(word.getKey() + " " + word.getValue());
        }
    }
}
