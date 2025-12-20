import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07032 {
    public static boolean check(int num){
        String s = Integer.toString(num);
        if(s.length() % 2 == 0 || s.length() == 1) return false;
        if(s.contains("2") || s.contains("4") || s.contains("6") || s.contains("8") || s.contains("0")) return false;
        StringBuilder r = new StringBuilder(s);
        return s.contentEquals(r.reverse());
    }

    public static void main(String argv[]) throws Exception {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        Map<Integer, Integer> freq1 = new HashMap<>();
        Map<Integer, Integer> freq2 = new HashMap<>();
        ArrayList <Integer> list1 = (ArrayList <Integer>) ois1.readObject();
        ArrayList <Integer> list2 = (ArrayList <Integer>) ois2.readObject();
        for (Integer i : list1){
            if(check(i)){
                freq1.put(i, freq1.getOrDefault(i, 0) + 1);
            }
        }
        for (Integer i : list2){
            if(check(i) && freq1.containsKey(i)){
                if(!freq2.containsKey(i)) freq2.put(i, freq1.get(i));
                freq2.put(i, freq2.get(i) + 1);
            }
        }
        ArrayList <Map.Entry<Integer, Integer>> numbers = new ArrayList<>(freq2.entrySet());
        Collections.sort(numbers, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                if (!o2.getValue().equals(o1.getValue())) return o1.getValue().compareTo(o2.getValue());
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for (Map.Entry<Integer, Integer> num : numbers.subList(0, Math.min(10, numbers.size()))){
            System.out.println(num.getKey() + " " + num.getValue());
        }
    }
}
